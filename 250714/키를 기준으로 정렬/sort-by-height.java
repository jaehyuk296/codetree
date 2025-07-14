import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int tall;
    int weight;

    public Student(String name, int tall, int weight) {
        this.name = name;
        this.tall = tall;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student other) {
        return this.tall - other.tall;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] student = new Student[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int tall = sc.nextInt();
            int weight = sc.nextInt();
            student[i] = new Student(name, tall, weight);
        }

        Arrays.sort(student);

        for (int i = 0; i < Math.min(n, 5); i++) {
            System.out.println(student[i].name + " " + student[i].tall + " " + student[i].weight);
        }
    }
}
