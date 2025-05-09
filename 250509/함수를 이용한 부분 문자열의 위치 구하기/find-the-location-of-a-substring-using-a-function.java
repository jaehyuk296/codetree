import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();

        System.out.println(find(text, pattern));
    }

    public static int find(String text, String pattern) {
        int textLen = text.length();
        int patternLen = pattern.length();

        for (int i = 0; i <= textLen - patternLen; i++) {
            if (text.substring(i, i + patternLen).equals(pattern)) {
                return i;
            }
        }
        return -1;
    }
}
