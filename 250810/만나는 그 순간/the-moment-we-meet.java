import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // A의 이동 계획
        String[] dirA = new String[n];
        int[] timeA = new int[n];
        int totalA = 0;
        for (int i = 0; i < n; i++) {
            dirA[i] = sc.next();
            timeA[i] = sc.nextInt();
            totalA += timeA[i];
        }

        // B의 이동 계획
        String[] dirB = new String[m];
        int[] timeB = new int[m];
        int totalB = 0;
        for (int i = 0; i < m; i++) {
            dirB[i] = sc.next();
            timeB[i] = sc.nextInt();
        }

        int[] posA = new int[totalA + 1];
        int[] posB = new int[totalA + 1];

        // A의 위치 시간별 기록
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int t = 0; t < timeA[i]; t++) {
                idx++;
                if (dirA[i].equals("R")) posA[idx] = posA[idx - 1] + 1;
                else posA[idx] = posA[idx - 1] - 1;
            }
        }

        // B의 위치 시간별 기록
        idx = 0;
        for (int i = 0; i < m; i++) {
            for (int t = 0; t < timeB[i]; t++) {
                idx++;
                if (dirB[i].equals("R")) posB[idx] = posB[idx - 1] + 1;
                else posB[idx] = posB[idx - 1] - 1;
            }
        }

        // 처음 만나는 시간 찾기
        int meetTime = -1;
        for (int t = 1; t <= totalA; t++) {
            if (posA[t] == posB[t]) {
                meetTime = t;
                break;
            }
        }

        System.out.println(meetTime);
    }
}
