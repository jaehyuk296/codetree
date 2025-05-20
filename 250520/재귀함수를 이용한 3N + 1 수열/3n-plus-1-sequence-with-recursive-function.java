import java.util.Scanner;
public class Main {
        static int cnt=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(acc(n));
    }

    public static int acc(int n){
        if(n==1)
        return cnt;

        if(n%2==0){
            n/=2;
            cnt++;
            return acc(n);
        }else{
            n=n*3+1;
            cnt++;
            return acc(n);
        }
    }
}