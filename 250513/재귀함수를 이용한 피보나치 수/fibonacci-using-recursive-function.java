import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pibbo(n));
    }

    public static int pibbo(int n) {
        if(n <= 0) return 0;
        else if(n == 1 || n == 2) return 1;
        return pibbo(n-1) + pibbo(n-2); 
    }
}
