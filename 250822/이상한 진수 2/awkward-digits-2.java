import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int maxVal = 0;

        for (int i = 0; i < a.length(); i++) {
            // i번째 자리 flip
            char[] arr = a.toCharArray();
            arr[i] = (arr[i] == '0') ? '1' : '0';

            // 2진수 → 10진수 변환
            int val = 0;
            for (int j = 0; j < arr.length; j++) {
                val = val * 2 + (arr[j] - '0');
            }

            // 최대값 갱신
            if (val > maxVal) {
                maxVal = val;
            }
        }

        System.out.println(maxVal);
    }
}
