import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int sum = 0;

        for (int a = A; a <= B; a++) {
            if (isMagicNumber(a)) {
                sum++;
            }
        }

        System.out.println(sum);
    }

    public static boolean isMagicNumber(int n) {
        return n % 3 == 0 || allDifferent(n);
    }

    public static boolean allDifferent(int n) {
        while (n > 0) {
            int digit = n % 10;  
            if (digit == 3 || digit == 6 || digit == 9) {
                return true;  
            }
            n /= 10;
        }
        return false;
    }
}
