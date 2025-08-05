import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt()+100;
            y[i] = sc.nextInt()+100;
        }
        // Please write your code here.
        int area [][] = new int [201][201];
        for (int a = 0; a < n; a++) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    area[x[a] + i][y[a] + j] = 1;
                }
            }
        }
        int w =0;
        for(int s=0;s<201;s++){
            for(int s2=0;s2<201;s2++){
                if(area[s][s2]==1)
                w++;
            }
        }
        System.out.println(w);
    }
}