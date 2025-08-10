import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // A의 구간 수
        int m = sc.nextInt(); // B의 구간 수

        int[][] A = new int[n][2];
        for (int i = 0; i < n; i++) {
            A[i][0] = sc.nextInt(); // 속도
            A[i][1] = sc.nextInt(); // 시간
        }

        int[][] B = new int[m][2];
        for (int i = 0; i < m; i++) {
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();
        }

        // 총 시간 계산 (A와 B의 총 시간은 같다고 가정)
        int totalTime = 0;
        for (int i = 0; i < n; i++) totalTime += A[i][1];

        int[] posA = new int[totalTime + 1];
        int[] posB = new int[totalTime + 1];

        // A의 초 단위 위치 계산
        int time = 0;
        for (int i = 0; i < n; i++) {
            int v = A[i][0];
            int t = A[i][1];
            for (int j = 0; j < t; j++) {
                time++;
                posA[time] = posA[time - 1] + v;
            }
        }

        // B의 초 단위 위치 계산
        time = 0;
        for (int i = 0; i < m; i++) {
            int v = B[i][0];
            int t = B[i][1];
            for (int j = 0; j < t; j++) {
                time++;
                posB[time] = posB[time - 1] + v;
            }
        }

        // 선두 변화 카운트
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
