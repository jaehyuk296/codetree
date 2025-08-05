import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt()+100;
            y1[i] = sc.nextInt()+100;
            x2[i] = sc.nextInt()+100;
            y2[i] = sc.nextInt()+100;
        }
        // Please write your code here.
        int offset [][] = new int [200][200];
        for(int i=0;i<n;i++){
            for(int j=x1[i];j<=x2[i];j++){
                offset[j][y1[i]]=1;
                offset[j][y2[i]]=1;
            }
        }
        int w = 0;
        for(int i=0;i<200;i++){
            for(int j=0;j<200;j++){
                if(offset[i][j]==1)
                    w++;
            }
        }
        System.out.println(w);
    }
}