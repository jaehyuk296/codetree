import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        int bin[] = new int[binary.length() + 50];

        for (int i = 0; i < binary.length(); i++) {
            bin[i] = binary.charAt(i) - '0';
        }

        int ten = 0;
        for (int i = 0; i < binary.length(); i++)
            ten = ten * 2 + bin[i];

        ten *= 17;

        int cnt = 0;
        while (true) {
            if (ten < 2) {
                bin[cnt++] = ten;
                break;
            }
            bin[cnt++] = ten % 2;
            ten /= 2;
        }

        for (int i = cnt - 1; i >= 0; i--) {
            System.out.print(bin[i]);
        }
    }
}
