import java.util.Scanner;

class store{
    String name;
    int code;

    public store(){
        this.name="codetree";
        this.code=50;
    }

    public store(String name, int code){
        this.name=name;
        this.code=code;
    }

    public void print(){
        System.out.println("product "+code+" is "+name);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
        // Please write your code here.
        store st = new store();
        store st2 = new store(id2,code2);
        st.print();
        st2.print();
    }
}