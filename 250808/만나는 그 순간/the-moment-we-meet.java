import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // A 명령 개수
        int m = sc.nextInt();  // B 명령 개수

        int[] A = new int[n];    // A 이동 거리
        char[] AS = new char[n]; // A 방향
        for (int i = 0; i < n; i++) {
            AS[i] = sc.next().charAt(0); // 방향 입력
            A[i] = sc.nextInt();         // 거리 입력
        }

        int[] B = new int[m];
        char[] BS = new char[m];
        for (int i = 0; i < m; i++) {
            BS[i] = sc.next().charAt(0);
            B[i] = sc.nextInt();
        }

        // A와 B의 현재 위치
        int posA = 0, posB = 0;
        // 명령 인덱스 및 남은 거리
        int idxA = 0, idxB = 0;
        int remainA = A[0], remainB = B[0];
        char dirA = AS[0], dirB = BS[0];

        // 시간 단위로 시뮬레이션
        for (int time = 1; ; time++) {
            // A 이동
            if (dirA == 'R') posA++;
            else posA--;

            remainA--;
            if (remainA == 0 && idxA + 1 < n) {
                idxA++;
                dirA = AS[idxA];
                remainA = A[idxA];
            }

            // B 이동
            if (dirB == 'R') posB++;
            else posB--;

            remainB--;
            if (remainB == 0 && idxB + 1 < m) {
                idxB++;
                dirB = BS[idxB];
                remainB = B[idxB];
            }

            // 위치 비교
            if (posA == posB) {
                System.out.println(time); // 처음 만난 시간 출력
                break;
            }

            // 둘 다 이동 끝났으면 종료
            if (remainA == 0 && idxA == n - 1 && remainB == 0 && idxB == m - 1) {
                System.out.println(0); // 끝까지 못 만난 경우
                break;
            }
        }
    }
}
