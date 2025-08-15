import java.util.*;

public class Main {
    static int N, M;
    static int[][] grid;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static boolean inRange(int x, int y) {
        return (0 <= x && x < N && 0 <= y && y < N);
    }

    static boolean isComfortable(int r, int c) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            int nx = r + dx[i];
            int ny = c + dy[i];
            if (inRange(nx, ny) && grid[nx][ny] == 1) {
                count++;
            }
        }
        return count == 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        grid = new int[N][N];

        for (int i = 0; i < M; i++) {
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;
            grid[r][c] = 1; // 색칠
            if (isComfortable(r, c)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
