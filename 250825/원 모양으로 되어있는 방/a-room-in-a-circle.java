import java.util.Scanner;

public class Main {
    public static int n;
    public static int[] arr;

    public static int dis(int start){
        int total = 0;
        for (int d = 0; d < n; d++) {                // d=0은 시작 방(이동 0)
            int idx = (start - 1 + d) % n;           // 반시계로 d칸 떨어진 방
            total += d * arr[idx];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int min = Integer.MAX_VALUE;
        for (int s = 1; s <= n; s++) {               // 모든 시작 방 검사
            int cost = dis(s);
            if (cost < min) min = cost;
        }
        System.out.println(min);
    }
}
