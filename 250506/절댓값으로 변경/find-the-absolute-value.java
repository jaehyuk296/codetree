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
        abs(arr);
    }

    public static void abs(int [] arr){
        int size = arr.length;
        for(int i=0;i<size;i++){
            if(arr[i]<0){
                arr[i]*=-1;
            }
        System.out.print(arr[i]+" ");
        }
        
    }
}