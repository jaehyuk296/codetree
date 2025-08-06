import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        // Please write your code here.
        int cnt =1;
        int max =1;
        boolean bool = true; //양수?
        for(int i=0;i<n;i++){
            if(bool){
                if(arr[i]>0){
                    cnt++;
                }else{
                    bool = false;
                    if(cnt>max)
                        max=cnt;
                    cnt=1;
                }
            }else{
                if(arr[i]<0){
                    cnt++;
                }else{
                    bool = true;
                    if(cnt>max)
                        max=cnt;
                    cnt=1;
                }
            }
            if(cnt>max)
                max = cnt;
        }
        System.out.println(max);
    }
}