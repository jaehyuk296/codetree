import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        print(n);
    }

    public static void print(int a){
        if(a==0)
        return;
        
        print(a-1);
        System.out.println("HelloWorld");
    }
}