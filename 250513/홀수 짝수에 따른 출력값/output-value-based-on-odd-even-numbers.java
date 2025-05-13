import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(numadd(n));
    }

    public static int numadd(int n){
        int i=n;
        if(i==0)
            return 0;
        else if(i==1)
            return 1;
        i-=2;
        return n+numadd(i);

    }
}