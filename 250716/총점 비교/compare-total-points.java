import java.util.*;

class Student implements Comparalbe <Student>{
    String name;
    int score1,score2,score3;

    public Student(String name,int score1,int score2,int score3){
        this.name=name;
        this.score1=score1;
        this.score1=score1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();
        }
        // Please write your code here.
    }
}