import java.util.*;

class Student implements Comparable <Student>{
    String name;
    int height;
    double weight;

    public Student(){

    }

    public Student(String name,int height,double weight){
        this.name=name;
        this.height=height;
        this.weight=weight;
    }

@Override
    public int compareTo(Student student){
        return student.height-this.height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        String[] names = new String[n];
        int[] heights = new int[n];
        double[] weights = new double[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            heights[i] = sc.nextInt();
            weights[i] = sc.nextDouble();
        }
        // Please write your code here.
        Student student [] = new Student [n];
        for (int i = 0; i < n; i++) {
            student[i]=new Student(names[i],heights[i],weights[i]);
        }
        System.out.println("name");
        Arrays.sort(student,new Comparator<Student>(){
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(student[i].name+" "+student[i].height+" "+student[i].weight);
        }
        System.out.println();
        System.out.println("height");
        Arrays.sort(student);
        for (int i = 0; i < n; i++) {
            System.out.println(student[i].name+" "+student[i].height+" "+student[i].weight);
        }
    }
}