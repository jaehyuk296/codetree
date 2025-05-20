import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(acc(n));
    }

    public  static int acc(int n){
        if(n==1)return 2;
        else if(n==2)return 4;
        else{
            return (acc(n - 1) * acc(n - 2))%100;
        }

    }
}