import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int cnt = 1;
        int max = 1;
        boolean isPositive = arr[0] > 0;

        for (int i = 1; i < n; i++) {
            if ((arr[i] > 0 && isPositive) || (arr[i] < 0 && !isPositive)) {
                cnt++;
            } else {
                max = Math.max(max, cnt);
                cnt = 1;
                isPositive = arr[i] > 0;
            }
        }

        max = Math.max(max, cnt);  // 마지막 구간 체크
        System.out.println(max);
    }
}
