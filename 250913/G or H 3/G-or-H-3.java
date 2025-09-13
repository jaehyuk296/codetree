import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// 인원 수
        int k = sc.nextInt();// 사진 크기
        int seat[] = new int[10001]; // 넉넉하게
        int maxPos = 0;

        for (int i = 0; i < n; i++) {
            int pos = sc.nextInt();
            char c = sc.next().charAt(0);
            int score = (c == 'G') ? 1 : 2;
            seat[pos] = score;
            maxPos = Math.max(maxPos, pos);
        }

        int max_score = 0;
        for (int i = 0; i <= maxPos; i++) {
            int sum_score = 0;
            for (int j = i; j <= i + k && j <= maxPos; j++) {
                sum_score += seat[j];
            }
            max_score = Math.max(max_score, sum_score);
        }

        System.out.println(max_score);
    }
}
