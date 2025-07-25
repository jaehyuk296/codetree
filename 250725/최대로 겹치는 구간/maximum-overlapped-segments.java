import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];

        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            if (x2[i] > maxIndex) {
                maxIndex = x2[i];
            }
        }

        int[] total = new int[maxIndex + 1];

        for (int i = 0; i < n; i++) {
            for (int j = x1[i]; j < x2[i]; j++) {
                total[j]++;
            }
        }

        int max = 0;
        for (int i = 0; i < total.length; i++) {
            if (total[i] > max) {
                max = total[i];
            }
        }

        System.out.print(max);
    }
}
