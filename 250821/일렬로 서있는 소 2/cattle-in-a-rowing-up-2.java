import java.util.Scanner;

public class Main {
    public static boolean bigger(int a,int b){
        if(a<=b){
            return true;
        }else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//소 몇마리
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int cnt = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(bigger(arr[i],arr[j])){
                    for(int k=j+1;k<n;k++){
                        if(bigger(arr[j],arr[k])) cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}