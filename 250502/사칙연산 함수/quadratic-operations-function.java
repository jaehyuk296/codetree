import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        // Please write your code here.
        switch(o){
            case'*':
                System.out.println(a+" "+o+" "+c+" = "+(a*c));
                break;
            case'/':
                System.out.println(a+" "+o+" "+c+" = "+(a/c));
                break;
            case'+':
                System.out.println(a+" "+o+" "+c+" = "+(a+c));
                break;
            case'-':
                System.out.println(a+" "+o+" "+c+" = "+(a-c));
                break;  
            default:
                System.out.println("False");
                break;
        }
    }
}