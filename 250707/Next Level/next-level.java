import java.util.Scanner;

class Character{
    String id;
    int level;

    public Character() {
        this.id = "codetree";
        this.level = 10;
    }

    public Character(String id,int level) {
        this.id = id;
        this.level = level;
    }

    public void print(){
        System.out.println("user "+id+ " lv "+level);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        // Please write your code here.
        Character cha = new Character();
        Character cha2 = new Character(id,level);

        cha.print();
        cha2.print();
    }
}