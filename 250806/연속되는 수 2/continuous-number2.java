import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int first = arr[0];
        int num =1 ;
        for(int i=1;i<n;i++){
            if(first==arr[i]){
                num++;
            }
            first=arr[i];
        }        
        System.out.println(num);
    }
}