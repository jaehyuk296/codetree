import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        System.out.println(result(n));
    }

    public static int result(int x){
        int sum=0;
        
        for(int i=0;i<=x;i++){
            sum+=i;
        }
        return sum/10;
    }
}