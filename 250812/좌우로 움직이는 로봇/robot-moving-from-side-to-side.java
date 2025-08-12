import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // A의 구간 개수
        int m = sc.nextInt(); // B의 구간 개수
        
        // A의 이동 계획
        int[] timeA = new int[n];
        char[] dirA = new char[n];
        int totalTimeA = 0;
        for (int i = 0; i < n; i++) {
            timeA[i] = sc.nextInt();
            dirA[i] = sc.next().charAt(0);
            totalTimeA += timeA[i];
        }
        
        // B의 이동 계획
        int[] timeB = new int[m];
        char[] dirB = new char[m];
        int totalTimeB = 0;
        for (int i = 0; i < m; i++) {
            timeB[i] = sc.nextInt();
            dirB[i] = sc.next().charAt(0);
            totalTimeB += timeB[i];
        }
        
        // 전체 시간
        int totalTime = Math.max(totalTimeA, totalTimeB);
        
        // 시간별 위치 기록
        int[] posA = new int[totalTime + 1];
        int[] posB = new int[totalTime + 1];
        
        // A 이동
        int pos = 0;
        int t = 0;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < timeA[i]; k++) {
                if (dirA[i] == 'R') pos++;
                else pos--;
                posA[++t] = pos;
            }
        }
        // 남는 시간은 마지막 위치 유지
        for (int i = t + 1; i <= totalTime; i++) posA[i] = posA[i - 1];
        
        // B 이동
        pos = 0;
        t = 0;
        for (int i = 0; i < m; i++) {
            for (int k = 0; k < timeB[i]; k++) {
                if (dirB[i] == 'R') pos++;
                else pos--;
                posB[++t] = pos;
            }
        }
        int cnt = 0;
        for (int i = t + 1; i <= totalTime; i++) posB[i] = posB[i - 1];
        for(int i=1;i<totalTime;i++){
            if(posA[i-1]!=posB[i-1])
                if(posA[i]==posB[i])
                    cnt++;
        }
        System.out.println(cnt);
    }
}
