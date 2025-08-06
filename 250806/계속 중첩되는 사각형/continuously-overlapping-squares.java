import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int area [][] = new int [201][201];
        int offset = 100;
        int color = 1; //홀수면 빨강색
        for (int i = 0; i < n; i++) {
                int x1 = sc.nextInt()+offset;
                int y1 = sc.nextInt()+offset;
                int x2 = sc.nextInt()+offset;
                int y2 = sc.nextInt()+offset;
            if(color%2!=0){//빨강색
                for(int j=x1;j<x2;j++){
                    for(int h=y1;h<y2;h++){
                        area[j][h]=1;
                    }
                }
            }
            else{
                for(int j=x1;j<x2;j++){
                    for(int h=y1;h<y2;h++){
                        area[j][h]=2;
                    }
                }
            }
            color++;
        }
        int w=0;
        for(int i=0;i<201;i++){
            for(int j=0;j<201;j++){
                if(area[i][j]==2)
                    w++;
            }
        }
        System.out.println(w);
    }
}