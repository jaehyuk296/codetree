import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt(); // 목표 합
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 전체 합
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int minDiff = Integer.MAX_VALUE; // 최소 차이

        // 두 개를 제거해보기
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { 
                int remainSum = sum - (arr[i] + arr[j]);
                int diff = Math.abs(remainSum - s);

                if (diff < minDiff) {
                    minDiff = diff;
                }
            }
        }

        // 최종적으로 차이값 출력
        System.out.println(minDiff);
    }
}
