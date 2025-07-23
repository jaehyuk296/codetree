import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.

        int[] arr = new int[binary.length()];
        for (int i = 0; i < binary.length(); i++) {
            arr[i] = binary.charAt(i) - '0';
        }
        int a=0;
        for(int i=0;i<binary.length();i++)
            a = a*2+arr[i];
        System.out.print(a);        
    }
}