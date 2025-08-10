import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][2];
        for (int i = 0; i < n; i++) {
            A[i][0] = sc.nextInt();//속도
            A[i][1] = sc.nextInt();//시간
        }
        int[][] B = new int[m][2];
        for (int i = 0; i < m; i++) {
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();
        }
        // Please write your code here.
        int total_time = 0;
        for(int i=0;i<n;i++){
            total_time+=A[i][1];//이동 시간은 동일
        }
        int[] posA = new int[totalTime + 1];
        int[] posB = new int[totalTime + 1];

        int time = 0;
        for(int i=0;i<n;i++){
            int v = A[i][0];
            int t = A[i][1];
            for (int j = 0; j < t; j++) {
                time++;
                posA[time] = posA[time - 1] + v;
            }
        }

        for(int i=0;i<n;i++){
            int v = B[i][0];
            int t = B[i][1];
            for (int j = 0; j < t; j++) {
                time++;
                posB[time] = posB[time - 1] + v;
            }
        }
        
        int cnt = 0;
        String leader = "same"; // 처음엔 동률
        for (int i = 1; i <= totalTime; i++) {
            String nowLeader;
            if (posA[i] > posB[i]) nowLeader = "A";
            else if (posB[i] > posA[i]) nowLeader = "B";
            else nowLeader = "same";

            if (!nowLeader.equals("same") && !nowLeader.equals(leader)) {
                cnt++;
                leader = nowLeader;
            }
        }

        System.out.println(cnt);
    }
}