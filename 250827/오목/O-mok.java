import java.util.Scanner;

public class Main {
    public static int[][] arr;

    public static boolean inSize(int i,int j){
        if(i-2 < 0 || i+2 >= 19) return false;
        if(j-2 < 0 || j+2 >= 19) return false;
        return true;
    }

    public static boolean horizon(int i,int j){
        if(!inSize(i,j)) return false;
        int stone = arr[i][j-2];
        if(stone == 0) return false;
        for(int col = j-2; col <= j+2; col++){
            if(arr[i][col] != stone) return false;
        }
        return true;
    }

    public static boolean vertical(int i,int j){
        if(!inSize(i,j)) return false;
        int stone = arr[i-2][j];
        if(stone == 0) return false;
        for(int row = i-2; row <= i+2; row++){
            if(arr[row][j] != stone) return false;
        }
        return true;
    }

    public static boolean diagonal(int i, int j) {
        if (!inSize(i, j)) return false;

        // ↘ 대각선
        int stone1 = arr[i-2][j-2];
        boolean bingo1 = stone1 != 0;
        for (int row = i-2, col = j-2; row <= i+2 && col <= j+2; row++, col++) {
            if (arr[row][col] != stone1) {
                bingo1 = false;
                break;
            }
        }

        // ↙ 대각선
        int stone2 = arr[i-2][j+2];
        boolean bingo2 = stone2 != 0;
        for (int row = i-2, col = j+2; row <= i+2 && col >= j-2; row++, col--) {
            if (arr[row][col] != stone2) {
                bingo2 = false;
                break;
            }
        }

        return bingo1 || bingo2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = new int[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt(); // 0,1,2
            }
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if(diagonal(i,j) || vertical(i,j) || horizon(i,j)){
                    System.out.println(arr[i][j]); // 돌 색 출력
                    System.out.println((i+1) + " " + (j+1));
                }
            }
        }
    }
}
