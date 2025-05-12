import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n, 1);  // 1부터 n까지 출력
        System.out.println();
        printDecreasing(n);     // n부터 1까지 출력
    }

    public static void printIncreasing(int n, int i) {
        if(i > n) return;
        System.out.print(i + " ");
        printIncreasing(n, i + 1);
    }

    public static void printDecreasing(int n) {
        if(n == 0) return;
        System.out.print(n + " ");
        printDecreasing(n - 1);
    }
}
