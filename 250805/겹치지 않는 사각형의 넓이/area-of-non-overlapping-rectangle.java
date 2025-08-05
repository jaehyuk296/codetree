import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 흰색 종이 A
        int ax1 = sc.nextInt() + 1000;
        int ay1 = sc.nextInt() + 1000;
        int ax2 = sc.nextInt() + 1000;
        int ay2 = sc.nextInt() + 1000;

        // 흰색 종이 B
        int bx1 = sc.nextInt() + 1000;
        int by1 = sc.nextInt() + 1000;
        int bx2 = sc.nextInt() + 1000;
        int by2 = sc.nextInt() + 1000;

        // 가리는 종이 (검은색 종이)
        int mx1 = sc.nextInt() + 1000;
        int my1 = sc.nextInt() + 1000;
        int mx2 = sc.nextInt() + 1000;
        int my2 = sc.nextInt() + 1000;

        int[][] area = new int[2001][2001];

        for (int i = ax1; i < ax2; i++) {
            for (int j = ay1; j < ay2; j++) {
                area[i][j] = 1;
            }
        }

        for (int i = bx1; i < bx2; i++) {
            for (int j = by1; j < by2; j++) {
                area[i][j] = 1;
            }
        }

        for (int i = mx1; i < mx2; i++) {
            for (int j = my1; j < my2; j++) {
                area[i][j] = 0;
            }
        }

        int w = 0;
        for (int i = 0; i < 2001; i++) {
            for (int j = 0; j < 2001; j++) {
                if (area[i][j] == 1)
                    w++;
            }
        }

        System.out.println(w);
    }
}
