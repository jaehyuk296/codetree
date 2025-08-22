import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();   // 2진수 입력 (문자열)

        int num[] = new int[a.length()];
        for (int i = 0; i < a.length(); i++) {
            num[i] = a.charAt(i) - '0';
        }

        boolean hasZero = false;

        // 앞자리는 유지하고, 두 번째 자리부터 0을 1로 바꾸는 게 최적
        for (int i = 1; i < a.length(); i++) {
            if (num[i] == 0) {
                num[i] = 1;
                hasZero = true;
                break;
            }
        }

        // 만약 전부 1이라서 못 바꿨다면 → 맨 앞을 0으로
        if (!hasZero) {
            num[a.length()] = 0;
        }

        // 2진수 → 10진수 변환
        int n = 0;
        for (int i = 0; i < a.length(); i++) {
            n = n * 2 + num[i];
        }

        System.out.println(n);
    }
}
