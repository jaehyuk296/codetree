import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int cnt=0;
        for(int i=a;i<=b;i++){
            if(!sosu(i)){
                if(even(i))
                    cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static boolean sosu(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return true;
            }
        }
        return false;
    }

    public static boolean even(int a){
        int ten = a/10;
        int one = a%10;

        if((ten+one)%2==0){
            return true;
        }
        return false;
    }
}