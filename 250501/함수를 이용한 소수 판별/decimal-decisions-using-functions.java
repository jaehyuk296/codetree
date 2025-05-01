import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int sum=0;
        for(int A=a;A<=b;A++){
            if(isprime(A)){
                sum+=A;
            }
        }
        System.out.println(sum);
    }

    public static boolean isprime(int n){
        for(int a=2;a<n;a++){
            if(n%a==0){
                return false;
            }
        }
        return true;
    }
}