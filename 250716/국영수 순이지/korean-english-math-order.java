import java.util.*;

class Student implements Comparable<Student>{
    int korean;
    int math;
    int english;
    String name;

    public Student(String name,int korean,int english, int math){
        this.korean=korean;
        this.english=english;
        this.math=math;
        this.name=name;
    }
    @Override
    public int compareTo(Student student){
        if(this.korean==student.korean){
            if(this.english==student.english)
                return student.math-this.math;
        return student.english-this.english;
        }
        return student.korean-this.korean;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] korean = new int[n];
        int[] english = new int[n];
        int[] math = new int[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            korean[i] = sc.nextInt();
            english[i] = sc.nextInt();
            math[i] = sc.nextInt();
        }
        // Please write your code here.
        Student stu [] = new Student [n];

        for (int i = 0; i < n; i++) {
            stu[i]=new Student(names[i],korean[i],english[i],math[i]);
        }
        Arrays.sort(stu);

        for(int i=0;i<n;i++){
            System.out.println(stu[i].name+" "+stu[i].korean+" "+stu[i].english+
            " "+stu[i].math);
        }
    }
}