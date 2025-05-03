import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // 월
        int d = sc.nextInt(); // 일

        switch (m) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (d >= 1 && d <= 31)
                    System.out.print("Yes");
                else
                    System.out.print("No");
                break;

            case 4: case 6: case 9: case 11:
                if (d >= 1 && d <= 30)
                    System.out.print("Yes");
                else
                    System.out.print("No");
                break;

            case 2:
                if (d >= 1 && d <= 28) // 윤년 고려 안 한 기본 조건
                    System.out.print("Yes");
                else
                    System.out.print("No");
                break;

            default:
                System.out.print("No");
        }
    }
}
