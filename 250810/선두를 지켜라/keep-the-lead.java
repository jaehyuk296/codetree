import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // A 구간 수
        int m = sc.nextInt(); // B 구간 수

        int[][] A = new int[n][2];
        for (int i = 0; i < n; i++) {
            A[i][0] = sc.nextInt();
            A[i][1] = sc.nextInt();
        }

        int[][] B = new int[m][2];
        for (int i = 0; i < m; i++) {
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();
        }

        int totalTime = 0;
        for (int i = 0; i < n; i++) totalTime += A[i][1];

        int[] posA = new int[totalTime + 1];
        int[] posB = new int[totalTime + 1];

        int time = 0;
        for (int i = 0; i < n; i++) {
            int v = A[i][0], t = A[i][1];
            for (int j = 0; j < t; j++) {
                time++;
                posA[time] = posA[time - 1] + v;
            }
        }

        time = 0;
        for (int i = 0; i < m; i++) {
            int v = B[i][0], t = B[i][1];
            for (int j = 0; j < t; j++) {
                time++;
                posB[time] = posB[time - 1] + v;
            }
        }

        int cnt = 0;
        String lastRealLeader = "same";

        for (int i = 1; i <= totalTime; i++) {
            String now;
            if (posA[i] > posB[i]) now = "A";
            else if (posB[i] > posA[i]) now = "B";
            else now = "same";

            if (now.equals("same")) {
                continue;
            }

            if (lastRealLeader.equals("same")) {
                // 첫 실제 선두가 등장한 순간: 카운트하지 않고 저장만
                lastRealLeader = now;
                continue;
            }

            if (!now.equals(lastRealLeader)) {
                cnt++;
                lastRealLeader = now;
            }
        }

        System.out.println(cnt);
    }
}
