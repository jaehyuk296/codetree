import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int offset = 1000;
        int[][] board = new int[2001][2001];

        int x1 = sc.nextInt() + offset;
        int y1 = sc.nextInt() + offset;
        int x2 = sc.nextInt() + offset;
        int y2 = sc.nextInt() + offset;

        int x3 = sc.nextInt() + offset;
        int y3 = sc.nextInt() + offset;
        int x4 = sc.nextInt() + offset;
        int y4 = sc.nextInt() + offset;

        // 첫 번째 사각형을 1로 채움
        for (int i = x1; i < x2; i++) {
            for (int j = y1; j < y2; j++) {
                board[i][j] = 1;
            }
        }

        // 두 번째 사각형으로 덮기 (0으로 만듦)
        for (int i = x3; i < x4; i++) {
            for (int j = y3; j < y4; j++) {
                board[i][j] = 0;
            }
        }

        // 남아있는 1들의 최소, 최대 좌표 찾기
        int minX = 2001, minY = 2001;
        int maxX = -1, maxY = -1;
        for (int i = 0; i < 2001; i++) {
            for (int j = 0; j < 2001; j++) {
                if (board[i][j] == 1) {
                    if (i < minX) minX = i;
                    if (i > maxX) maxX = i;
                    if (j < minY) minY = j;
                    if (j > maxY) maxY = j;
                }
            }
        }

        // 넓이 계산
        int area = 0;
        if (maxX >= 0 && maxY >= 0) {
            area = (maxX - minX + 1) * (maxY - minY + 1);
        }

        System.out.println(area);
    }
}
