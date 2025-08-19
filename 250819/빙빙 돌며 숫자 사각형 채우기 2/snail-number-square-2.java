import java.util.Scanner;

public class Main {
    static int N, M;
    static int[][] grid;
    // 하, 우, 상, 좌
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    static boolean inRange(int x, int y) {
        return (0 <= x && x < N && 0 <= y && y < M);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        grid = new int[N][M];

        int x = 0, y = 0;   // 시작점 (좌측 상단)
        int dir = 0;        // 시작 방향: 하(↓)

        for (int i = 1; i <= N * M; i++) {
            grid[x][y] = i; // 숫자 채우기

            // 다음 위치 계산
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            // 범위를 벗어나거나 이미 채워져 있으면 방향 전환
            if (!inRange(nx, ny) || grid[nx][ny] != 0) {
                dir = (dir + 1) % 4; // 하→우→상→좌 순환
                nx = x + dx[dir];
                ny = y + dy[dir];
            }

            x = nx;
            y = ny;
        }

        // 결과 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("%d ", grid[i][j]);
            }
            System.out.println();
        }
    }
}
