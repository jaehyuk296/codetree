import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int result = arr[0];
        for (int i = 1; i < n; i++) {
            result = lcm(result, arr[i]);
        }

        System.out.println(result);
    }

    // 최대공약수 (재귀로 구현)
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // 최소공배수 (gcd를 사용)
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}