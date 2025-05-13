import java.util.Scanner;

public class Main {
    static int cnt = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(oddadd(n));
    }

    public static int oddadd(int n) {
        if (n == 1) return cnt;
        
        if (n % 2 == 1) {
            n /= 3;  
        } else {
            n /= 2;  
        }
        cnt++;  
        return oddadd(n);  
    }
}
