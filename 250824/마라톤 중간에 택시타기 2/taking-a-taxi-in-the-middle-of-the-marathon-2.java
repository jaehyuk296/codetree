import java.util.*;

public class Main {
    public static int Distance(int x1,int x2){
        int dis = Math.abs(x1-x2);
        return dis;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//체크 포인터 개수
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        int total = 0;
        for(int i=1;i<n;i++){
            total += Distance(x[i-1],x[i])+Distance(y[i-1],y[i]);//총 길이에서 뺴기
        }
        int maxSave = 0;
        for(int i=1;i<n-1;i++){
            int original = Distance(x[i - 1], x[i]) + Distance(y[i - 1], y[i])
                         + Distance(x[i], x[i + 1]) + Distance(y[i], y[i + 1]);
            int skip = Distance(x[i - 1], x[i + 1]) + Distance(y[i - 1], y[i + 1]);
            int save = original - skip; // 절약되는 거리
            if (maxSave < save) maxSave = save;
        }
        System.out.println(total-maxSave);
    }
}