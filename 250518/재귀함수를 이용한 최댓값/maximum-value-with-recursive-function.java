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
        System.out.println(max(arr));

    }
    public static int max(int a []){
        int size = a.length;
        int max2 = a[0];
        for(int i=1;i<size;i++){
            if(max2<a[i])max2=a[i];
            
        }
        return max2;
    }
}