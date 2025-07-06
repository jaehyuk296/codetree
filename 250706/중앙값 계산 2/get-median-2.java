import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 전체 입력 개수
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // 입력 받기
        }

        List<Integer> medians = new ArrayList<>();
        
        for (int i = 1; i <= n; i += 2) { // 홀수 개씩 추출: 1, 3, 5, ...
            int[] temp = Arrays.copyOfRange(arr, 0, i); // 0 ~ i-1 까지 복사
            Arrays.sort(temp);
            int mid = temp[i / 2]; // 중앙값 추출
            medians.add(mid);
        }

        for (int m : medians) {
            System.out.print(m + " ");
        }
    }
}
