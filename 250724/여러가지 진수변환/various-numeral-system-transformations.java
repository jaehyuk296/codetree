import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int arr [] = new int [30];
        int i=0;

        while(true){
            if(n<2){
                arr[i++]=n;
                break;
            }
            arr[i++]=n%b;
            n/=b;
        }

        for(int j=i-1;j>=0;j--){
            System.out.print(arr[j]);
        }
    }
}