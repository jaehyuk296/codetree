import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int sum = 0;
        int max = -1;
        for(int i=0;i<n;i++){
            for(int j=i+2;j<n;j++){
                sum = arr[i]+arr[j];
                if(max < sum) max = sum;
            }
        }
        System.out.println(max);
    }
}