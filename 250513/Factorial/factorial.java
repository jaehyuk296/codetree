import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        System.out.println(fact(n));
    }

    public static int fact(int n){
        if(n==1||n==0)
            return 1;
        return fact(n-1)*n;
    }
}