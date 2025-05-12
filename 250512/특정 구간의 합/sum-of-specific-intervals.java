import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int [] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            // Please write your code here.
           arr2[i] = sumAll(a1,a2,arr);
        }

        for (int i = 0; i < m; i++) {
            System.out.println(arr2[i]);
        }
    }

    public static int sumAll(int b1,int b2,int []arr) {
        int sum = 0;
        for(int i = b1; i <= b2; i++)
            sum += arr[i-1];
        
        return sum;
    }
}