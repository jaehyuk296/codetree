import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        System.out.println(min(a,b,c));
    }

    public static int min(int a, int b, int c){
        int min = a;
        if(a>b){
            min = b;
        }

        if(min>c){
            min=c;
        }

        return min;
    }
}