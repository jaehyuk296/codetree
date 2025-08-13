import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=0,y=0;
        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();
            // Please write your code here.
            if (direction == 'N') {
                y += distance;
            } else if (direction == 'E') {
                x += distance;
            } else if (direction == 'S') {
                y -= distance;
            } else if (direction == 'W') {
                x -= distance;
            }
        }
        System.out.println(x+" "+y);
    }
}