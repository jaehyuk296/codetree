import java.util.Scanner;

class Bomb{
    String code;
    char rgb;
    int second;

    public Bomb(String code, char rgb, int second){
        this.code=code;
        this.rgb=rgb;
        this.second=second;
    }

    public void print(){
        System.out.println("code : "+code);
        System.out.println("color : "+rgb);
        System.out.println("second : "+second);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.
        Bomb boom = new Bomb(uCode,lColor,time);
        boom.print();
    }
}