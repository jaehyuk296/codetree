import java.util.Scanner;

public class Main {
    public static boolean inRange(int x, int y, int n) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    public static int away(char c) {
        if (c == 'U') return 0;
        if (c == 'R') return 1;
        if (c == 'D') return 2;
        if (c == 'L') return 3;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 크기
        int T = sc.nextInt(); // 시간
        int R = sc.nextInt() - 1; // 행 (0-index 변환)
        int C = sc.nextInt() - 1; // 열 (0-index 변환)
        String D = sc.next();     // 방향(U,D,R,L)

        // U, R, D, L 순서
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        int dir = away(D.charAt(0));

        for (int i = 0; i < T; i++) {
            int nextR = R + dx[dir];
            int nextC = C + dy[dir];

            if (inRange(nextR, nextC, N)) {
                R = nextR;
                C = nextC;
            } else {
                dir = (dir + 2) % 4; // 반대 방향
            }
        }

        System.out.println((R + 1) + " " + (C + 1)); // 다시 1-index로 출력
    }
}
