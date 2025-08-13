import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int x = 0, y = 0;
        int angle = 0; // 0: 북, 90: 동, 180: 남, 270: 서

        for (int i = 0; i < s.length(); i++) {
            char cmd = s.charAt(i);

            if (cmd == 'L') {
                angle = (angle + 270) % 360; // 왼쪽 90도 회전
            } else if (cmd == 'R') {
                angle = (angle + 90) % 360;  // 오른쪽 90도 회전
            } else if (cmd == 'F') {
                switch (angle) {
                    case 0:   y++; break; // 북
                    case 90:  x++; break; // 동
                    case 180: y--; break; // 남
                    case 270: x--; break; // 서
                }
            }
        }

        System.out.println(x + " " + y);
    }
}
