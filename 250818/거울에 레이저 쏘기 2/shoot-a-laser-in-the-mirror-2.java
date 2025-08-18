import java.util.Scanner;

public class Main {
    static int n;
    static char[][] grid;
    static int[] dx = {-1, 0, 1, 0}; // 상, 우, 하, 좌
    static int[] dy = {0, 1, 0, -1};

    // 시작 번호로 좌표와 방향 설정
    public static int[] getStart(int size, int startNum) {
        if (startNum <= size) { // 위쪽
            return new int[]{0, startNum - 1, 2}; // (x, y, dir=하)
        } else if (startNum <= size * 2) { // 오른쪽
            return new int[]{startNum - size - 1, size - 1, 3}; // 좌
        } else if (startNum <= size * 3) { // 아래쪽
            return new int[]{size - 1, size - (startNum - size * 2), 0}; // 상
        } else { // 왼쪽
            return new int[]{size - (startNum - size * 3), 0, 1}; // 우
        }
    }

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new char[n][n];

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                grid[i][j] = s.charAt(j);
            }
        }

        int startNum = sc.nextInt();

        int[] start = getStart(n, startNum);
        int x = start[0], y = start[1], dir = start[2];
        int cnt = 0;
        while (inRange(x, y)) {
            char mirror = grid[x][y];
            if (mirror == '/') {
                if (dir == 0) dir = 1;
                else if (dir == 1) dir = 0;
                else if (dir == 2) dir = 3;
                else dir = 2;
            } else if (mirror == '\\') {
                if (dir == 0) dir = 3;
                else if (dir == 3) dir = 0;
                else if (dir == 2) dir = 1;
                else dir = 2;
            }
            // 이동
            x += dx[dir];
            y += dy[dir];
            cnt++;
        }

        // 격자 밖으로 나간 좌표 출력 (1-based로 변환)
        System.out.println(cnt);
    }
}
