import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        if (isValidYear(y) && isValidDate(y, m, d)) {
            printSeason(m);
        } else {
            System.out.println(-1);
        }
    }

    public static boolean isValidYear(int year) {
        return (year >= 1 && year <= 3000);
    }

    public static boolean yoon(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (month < 1 || month > 12) return false;

        int[] daysInMonth = {
            31, yoon(year) ? 29 : 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        return (day >= 1 && day <= daysInMonth[month - 1]);
    }

    public static void printSeason(int mon) {
        switch (mon) {
            case 3: case 4: case 5:
                System.out.println("Spring");
                break;
            case 6: case 7: case 8:
                System.out.println("Summer");
                break;
            case 9: case 10: case 11:
                System.out.println("Fall");
                break;
            case 12: case 1: case 2:
                System.out.println("Winter");
                break;
        }
    }
}
