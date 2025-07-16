import java.util.*;

class Student implements Comparable<Student> {
    int weight, height, id;
    static int number = 0;

    public Student(int height, int weight) {
        this.height = height;
        this.weight = weight;
        this.id = ++number;
    }

    @Override
    public int compareTo(Student student) {
        if (this.height == student.height)
            return student.weight - this.weight;
        return student.height - this.height;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        int[] weight = new int[n];

        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();
        }

        Student[] student = new Student[n];
        for (int i = 0; i < n; i++) {
            student[i] = new Student(height[i], weight[i]);
        }

        Arrays.sort(student);

        for (int i = 0; i < n; i++) {
        System.out.println(student[i].height + " " +
                   student[i].weight + " " +
                   student[i].id);

        }
    }
}
