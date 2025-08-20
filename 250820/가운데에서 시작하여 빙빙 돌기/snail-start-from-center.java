import java.util.Scanner;

public class Main {
    public static int N;
    public static int[][] grid;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        grid = new int[N][N];

        // 방향: 위, 왼, 아래, 오
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        int x = N / 2, y = N / 2; // 시작점
        int num = 1;
        grid[x][y] = num++;

        int step = 1; // 현재 이동해야 할 칸 수
        int dir = 3;  // 현재 방향 인덱스

        while (num <= N * N) {
            for (int repeat = 0; repeat < 2; repeat++) { // 같은 step을 두 번 반복
                for (int i = 0; i < step; i++) {
                    if (num > N * N) break;
                    x += dx[dir];
                    y += dy[dir];
                    grid[x][y] = num++;
                }
                dir = (dir + 1) % 4; // 방향 전환
            }
            step++; // 두 번 끝나면 step 증가
        }

        // 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
