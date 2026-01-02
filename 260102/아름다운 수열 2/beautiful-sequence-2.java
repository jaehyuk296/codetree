import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < M; i++)
            B[i] = sc.nextInt();
        // Please write your code here.
        int result = 0;
        Arrays.sort(B);
        int cnt = 0;
        // A 배열에서 길이가 M인 모든 구간을 검사 (i는 시작점)
        for (int i = 0; i <= N - M; i++) {
            // 1. 현재 구간 [i, i+M-1]의 숫자들을 복사하거나 빈도수를 센다.
            // 2. 수열 B의 숫자 구성과 비교한다.
            // Tip: 두 배열을 정렬(Sort)해서 똑같은지 비교하는 것이 가장 간단합니다!
            
            int[] temp = new int[M];
            for(int k = 0; k < M; k++) {
                temp[k] = A[i + k];
            }
            
            // temp와 B를 정렬한 뒤, 모든 원소가 같은지 확인해보세요.
            Arrays.sort(temp);
            boolean check = true;

            for(int k=0;k<M;k++){
                if(temp[k]!=B[k]){
                    check = false;
                    break;
                }
            }

            if(check)
            cnt++;
        }
        System.out.println(cnt);
    }
}