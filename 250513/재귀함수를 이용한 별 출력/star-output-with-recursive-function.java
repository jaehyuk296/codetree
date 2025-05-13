import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printstar(n);
    }
    public static void printstar(int a){
        if(a==0)return;

        printstar(a-1);
        for(int i=0;i<a;i++){
            System.out.print("*");    
        }
        System.out.println();
    }
}