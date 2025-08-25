import java.util.Scanner;
public class Main {
    public static int n;
    public static int arr [];
    public static int dis(int firstroom){
        int total = 0;
        for(int i=0;i<n;i++){
            total = total + (i * arr[firstroom-1]);
            firstroom++;
            if(firstroom>n)firstroom%=n;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();//방 개수
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();//각 방마다 수용 인원
        // Please write your code here.
        int min = 10000;
        for(int i=1;i<n;i++){
            int room = dis(i);
            if(room < min) min = room;
        }
        System.out.println(min);                                             
    }
}