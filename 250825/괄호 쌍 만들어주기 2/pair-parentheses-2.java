import java.util.Scanner;

public class Main {
    public static boolean check(char a, char b) {
        return a == b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int open = 0, close = 0;

        for (int i = 0; i < input.length() - 1; i++) { // i+1까지 안전하게 접근
            if (check(input.charAt(i), input.charAt(i+1))) {
                if (input.charAt(i) == '(') {
                    open++;
                } else if (input.charAt(i) == ')') {
                    close++;
                }
                if(open < close) close = 0; // ')'가 먼저 나오면 초기화
            }
        }

        System.out.println(open * close);
    }
}
