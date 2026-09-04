import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        // Please write your code here.
        int maxCoins = 0;

        for (int r1 = 0; r1 < n; r1++) {
            for (int c1 = 0; c1 <= n - 3; c1++) {
                
                for (int r2 = 0; r2 < n; r2++) {
                    for (int c2 = 0; c2 <= n - 3; c2++) {
                        
                        if (r1 == r2 && Math.abs(c1 - c2) < 3) {
                            continue;
                        }

                        int sum1 = arr[r1][c1] + arr[r1][c1 + 1] + arr[r1][c1 + 2];

                        int sum2 = arr[r2][c2] + arr[r2][c2 + 1] + arr[r2][c2 + 2];

                        maxCoins = Math.max(maxCoins, sum1 + sum2);
                    }
                }

            }
        }
        System.out.println(maxCoins);
    }
}