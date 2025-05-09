import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        if(same(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

    public static boolean same(String a){
        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i) != a.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }
}