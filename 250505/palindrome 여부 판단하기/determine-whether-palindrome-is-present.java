import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        
        if(palindrome(input)) System.out.println("Yes");
        else System.out.println("No");
    }

    public static boolean palindrome(String str) {
        int size = str.length();  
        for (int i = 0; i < size / 2; i++) {
            if (str.charAt(i) != str.charAt(size - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
