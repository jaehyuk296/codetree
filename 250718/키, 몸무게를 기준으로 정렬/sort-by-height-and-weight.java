import java.util.*;

class Student implements Comparable<Student>{
    int height,weight;
    String name;

    public Student(String name,int height,int weight){
        this.weight=weight;
        this.height=height;
        this.name=name;
    }

    @Override
    public int compareTo(Student student){
        if(student.height==this.height)
            return student.weight-this.weight;
        return this.height-student.height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student student []=new Student [n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            // Please write your code here.
            student[i]=new Student(name,height,weight);
        }
        Arrays.sort(student);
        for (int i = 0; i < n; i++) {
            System.out.println(student[i].name+" "+student[i].height+" "+student[i].weight);
        }
    }
}