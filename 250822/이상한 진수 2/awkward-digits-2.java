import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();   // 2진수 입력 (문자열)

        int num[] = new int[a.length()];
        for (int i = 0; i < a.length(); i++) {
            num[i] = a.charAt(i) - '0';
        }

        boolean changed = false;

        // 맨 앞 제외, 왼쪽에서부터 처음 0을 1로 바꾼다
        for (int i = 1; i < a.length(); i++) {
            if (num[i] == 0) {
                num[i] = 1;
                changed = true;
                break;
            }
        }

        // 모두 1이라서 못 바꿨다면 → 맨 뒤를 0으로 바꿈
        if (!changed) {
            num[a.length() - 1] = 0;
        }

        // 2진수 → 10진수 변환
        int n = 0;
        for (int i = 0; i < a.length(); i++) {
            n = n * 2 + num[i];
        }

        System.out.println(n);
    }
}
