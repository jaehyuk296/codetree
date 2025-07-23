import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        // Please write your code here.
        int[] daysInMonth = {0,31,29,31,30,31,30,31,31,30,31,30,31};
        String[] week = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int total1 = 0;
        for (int i = 1; i < m1; i++) {
            total1 += daysInMonth[i];
        }
        total1 += d1;

        int total2 = 0;
        for (int i = 1; i < m2; i++) {
            total2 += daysInMonth[i];
        }
        total2 += d2;
        int[] count = new int[7];
        for (int day = total1; day <= total2; day++) {
            int dayOfWeek = (day - total1) % 7; // 기준일부터 얼마나 지났는지
            count[dayOfWeek]++;
        }

        for (int i = 0; i < 7; i++) {
            if (week[i].equals(A)) {
                System.out.println(count[i]);
                break;
            }
        }

    }
}