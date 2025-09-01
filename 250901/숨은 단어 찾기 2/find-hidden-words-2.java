import java.util.Scanner;

public class Main {
    // 8방향: ↖, ↑, ↗, ←, →, ↙, ↓, ↘
    public static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    public static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static boolean check(char[][] grid, int x, int y, int dir) {
        String word = "LEE";
        int n = grid.length;
        int m = grid[0].length;

        for (int k = 0; k < word.length(); k++) {
            int nx = x + dx[dir] * k;
            int ny = y + dy[dir] * k;
            if (nx < 0 || nx >= n || ny < 0 || ny >= m) return false;
            if (grid[nx][ny] != word.charAt(k)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] arr = new String[n];
        char[][] change = new char[n][m];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
            for (int j = 0; j < m; j++) {
                change[i][j] = arr[i].charAt(j);
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (change[i][j] == 'L') {
                    for (int d = 0; d < 8; d++) { // 8방향 탐색
                        if (check(change, i, j, d)) {
                            count++;
                        }
                    }
                }
            }
        }

        System.out.println(count);
    }
}
