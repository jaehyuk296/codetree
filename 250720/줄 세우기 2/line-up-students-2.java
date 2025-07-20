import java.util.*;

class Student implements Comparable<Student>{
    int weight,height;
    int index;
    public Student(int height,int weight){
        this.weight=weight;
        this.height=height;
        this.index=0;
    }
    
    @Override
    public int compareTo(Student student){
        if(this.height==student.height)
            return student.weight-this.weight;
        return this.height-student.height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student student [] = new Student [n];

        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            student[i]=new Student(height,weight);
            student[i].index=i+1;
        }
        // Please write your code here.
        Arrays.sort(student);
        for (int i = 0; i < n; i++) {
            System.out.println(student[i].height+" "+student[i].weight+" "+student[i].index);
        }
        

    }
}