import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        even(n);
    }

    public static void even(int x){
        if(x%2==0){
            if(mul(x)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }else{
            System.out.println("No");
        }
    }

    public static boolean mul(int x){
        int n,m;
        n=x/10;
        m=x%10;
        if((n+m)%5==0){
            return true;
        }
        else{
            return false;
        }
    }
}