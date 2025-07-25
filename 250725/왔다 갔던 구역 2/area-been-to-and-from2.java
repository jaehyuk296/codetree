import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] num = new int[N];
        char[] pos = new char[N];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            num[i] = x;
            pos[i] = dir;
        }

        int[] arr = new int[2001];
        int now = 1000;

        for (int i = 0; i < N; i++) {
            if (pos[i] == 'R') {  // 오른쪽 이동
                for (int j = now; j < now + num[i]; j++) {
                    arr[j]++;
                }
                now += num[i];
            } else {              // 왼쪽 이동
                for (int j = now - 1; j >= now - num[i]; j--) {
                    arr[j]++;
                }
                now -= num[i];
            }
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}
