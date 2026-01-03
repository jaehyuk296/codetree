import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//바구니 수
        int k = sc.nextInt();//+- 바구니 
        int[] candies = new int[n];// 사탕 개수
        int[] positions = new int[n];// 바구니 좌표
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
            positions[i] = sc.nextInt();
        }
        // Please write your code here.
        int[] sortedPos = positions.clone(); 
        Arrays.sort(sortedPos);

        // 2. 정렬된 좌표 순서에 맞게 사탕 배열도 새로 배치합니다.
        int[] sortedCandies = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 원본 positions에서 정렬된 좌표의 위치를 찾는다.
                if (sortedPos[i] == positions[j]) {
                    sortedCandies[i] = candies[j];
                    break; 
                }
            }
        }

        int maxCandies = 0;
        int currentSum = 0;
        int left = 0;
    
        for(int right = 0; right < n; right++){
            currentSum += sortedCandies[right];

            // 1. 거리가 멀면 왼쪽을 깎아내고
            while(sortedPos[right] - sortedPos[left] > 2 * k){
                currentSum -= sortedCandies[left];
                left++; 
            }
            
            if (currentSum > maxCandies) {
                maxCandies = currentSum;
            }
        }
        System.out.println(maxCandies);
    }
}