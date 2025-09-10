import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//n개의 숫자
        int k = sc.nextInt();//n개의 숫자중 연속된 k개 뽑기
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();//데이터 입력
        // Please write your code here.
        int sum_max = 0;
        int max = 0;

        for(int i=0;i<=n-k;i++){
            for(int j=0;j<k;j++){
                sum_max += arr[i+j];
            }
            if(sum_max>max)max=sum_max;
            sum_max = 0;
        }
    System.out.println(max);
    }
}