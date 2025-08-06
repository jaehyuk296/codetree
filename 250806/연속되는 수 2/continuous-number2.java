import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 숫자의 개수
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // 숫자 입력 받기
        }

        int maxCount = 1;
        int currentCount = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                currentCount++; // 연속된 숫자 증가
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                currentCount = 1; // 연속 종료, 다시 1로 초기화
            }
        }

        System.out.println(maxCount);
    }
}
