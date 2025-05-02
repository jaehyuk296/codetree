import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        System.out.println(mult(a,b));


    }
    public static int mult(int a, int b){
        int var=1;
        for(int i=0;i<b;i++){
            var=var*a;
        }
        return var;
    }
}