import java.util.Scanner;

class Select {   
    String code;
    char place;
    int time;

    public Select(String code, char place, int time) {
        this.code = code;
        this.place = place;
        this.time = time;
    }

    public void print() {
        System.out.println("secret code : " + code);
        System.out.println("meeting point : " + place);
        System.out.println("time : " + time);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sCode = sc.next();
        char mPoint = sc.next().charAt(0);
        int time = sc.nextInt();

        Select sel = new Select(sCode, mPoint, time);
        sel.print();
    }
}
