import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.
        char text[] =  s.toCharArray();
        Arrays.sort(text);
        String sorttext =new String(text);
        System.out.println(sorttext);
    }
}