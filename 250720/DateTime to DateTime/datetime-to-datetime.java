import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.
        int day = 11;
        int hour = 11;
        int min = 11;

        int date = A-day;
        date = date*24*60;
        int time = B-hour;
        time = time*60;
        int minute = C-min;
        int wrong = -1;
        if(date<0)
            System.out.println(wrong);
        else
            System.out.println(date+time+minute);
    }
}