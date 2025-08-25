import java.util.Scanner;

public class Main {
    public static int char_to_num(char a) {
        if (a == 'C') return 1;
        else if (a == 'O') return 2;
        else if (a == 'W') return 3;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            char a = str.charAt(i);
            num[i] = char_to_num(a);
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (num[i] < num[j] && num[j] < num[k]) cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
