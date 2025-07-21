import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int[] daysInMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] week = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        // 기준일(m1, d1)부터의 총 일 수
        int total1 = 0;
        for (int i = 1; i < m1; i++) {
            total1 += daysInMonth[i];
        }
        total1 += d1;

        // 목표일(m2, d2)부터의 총 일 수
        int total2 = 0;
        for (int i = 1; i < m2; i++) {
            total2 += daysInMonth[i];
        }
        total2 += d2;

        int diff = total2 - total1;
        int resultIndex = (0 + diff % 7 + 7) % 7; // 음수 대비

        System.out.println(week[resultIndex]);
    }
}
