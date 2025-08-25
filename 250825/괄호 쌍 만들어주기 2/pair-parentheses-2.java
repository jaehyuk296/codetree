import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int open = 0, close = 0;

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == '(' && input.charAt(i+1) == '(') {
                open++;
            }
            if (input.charAt(i) == ')' && input.charAt(i+1) == ')') {
                close++;
            }
        }

        System.out.println(open * close);
    }
}
