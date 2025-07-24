import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();
        // Please write your code here.
        int num = 0;
        int arr [] = new int [30];

        for(int i=0;i<N.length();i++){
            arr[i] = N.charAt(i) - '0';
        }

        for (int i = 0; i < N.length(); i++) {
            num = num * A + arr[i];
        }
        int cnt = 0;
        int arr2 [] = new int [30];
        while(true){
            if(num<B){
                arr2[cnt++] = num;
                break;
            }
            arr2[cnt++] = num%B;
            num/=B;
        }

        for(int i=cnt-1;i>=0;i--){
            System.out.print(arr2[i]);
        }
    }
}