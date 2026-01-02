import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0; // 조건을 만족하는 구간의 개수

        // 2. 모든 가능한 구간 [i, j] 탐색
        for (int i = 0; i < n; i++) { // 구간 시작점
            for (int j = i; j < n; j++) { // 구간 끝점
                
                // 현재 구간 [i, j]의 원소 합 구하기
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                double average = (double) sum / (j - i + 1);
                
                boolean hasAverage = false;
                for (int k = i; k <= j; k++) {
                    if (arr[k] == average) {
                        hasAverage = true;
                        break;
                    }
                }
                
                // 조건을 만족하면 카운트 증가
                if (hasAverage) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}