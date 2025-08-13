import java.util.Scanner;

public class Main {
    // 배열의 크기 'n'을 인자로 받아 유효한 범위인지 확인
    public static boolean inRange(int x, int y, int n) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 배열의 크기 입력
        int[][] arr = new int[n][n];

        // 2차원 배열에 값 입력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int totalCount = 0; // 전체 배열에서 조건에 맞는 셀의 총 개수

        // 상하좌우 방향을 나타내는 배열
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        // 2차원 배열의 모든 셀을 순회
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int adjacentOnes = 0; // 현재 셀 주변의 1의 개수

                // 현재 셀 (i, j)의 상하좌우 4방향 탐색
                for (int dir = 0; dir < 4; dir++) {
                    int nx = i + dx[dir];
                    int ny = j + dy[dir];

                    // 새로운 좌표가 배열 범위 안에 있고, 값이 1인 경우
                    if (inRange(nx, ny, n) && arr[nx][ny] == 1) {
                        adjacentOnes++;
                    }
                }
                // 만약 현재 셀 주변에 1이 있다면, 총 개수에 추가
                if (adjacentOnes >= 3) {
                    totalCount++;
                }
            }
        }
        System.out.println(totalCount);
        sc.close();
    }
}