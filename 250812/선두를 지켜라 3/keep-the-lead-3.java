import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//A이동 횟수
        int m = sc.nextInt();//B이동 횟수
        int[][] a = new int[n][2];
        int[][] b = new int[m][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();//A의 속도
            a[i][1] = sc.nextInt();//A의 시간
        }
        for (int i = 0; i < m; i++) {
            b[i][0] = sc.nextInt();//B의 속도
            b[i][1] = sc.nextInt();//B의 시간
        }
        // Please write your code here.
        int totalTime = 0;
        for(int i=0;i<n;i++){
            totalTime += a[i][1];//A,B 이동한 시간은 항상 동일 
        }

        int first [] = new int [totalTime+1];//매 시간마다 선두 구하기(명예의 전당)
        int posA [] = new int [totalTime+1];//매 초마다 A의 이동거리
        int posB [] = new int [totalTime+1];//매 초마다 B의 이동거리

        int time = 0; 
        for (int i = 0; i < n; i++) {//A이동거리 
            int v = a[i][0], t = a[i][1];
            for (int j = 0; j < t; j++) {
                time++;
                posA[time] = posA[time - 1] + v;
            }
        }

        time = 0; 
        for (int i = 0; i < m; i++) {//B이동거리 
            int v = b[i][0], t = b[i][1];
            for (int j = 0; j < t; j++) {
                time++;
                posB[time] = posB[time - 1] + v;
            }
        }

        // 선두 판별: 0=동점, 1=A, 2=B
        for (int i = 0; i <= totalTime; i++) {
            if (posA[i] > posB[i]) first[i] = 1;
            else if (posA[i] < posB[i]) first[i] = 2;
            else first[i] = 0; // 동점
        }

        // 변경 횟수 계산
        int cnt = 0;
        for (int i = 1; i <= totalTime; i++) {
            if (first[i] != first[i-1]) cnt++;
        }
        System.out.println(cnt);

    }
}