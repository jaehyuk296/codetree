import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        // Please write your code here.
        char word1_change [] = word1.toCharArray();
        char word2_change [] = word2.toCharArray();
        Arrays.sort(word1_change);
        Arrays.sort(word2_change);
        String arr1 = new String(word1_change);
        String arr2 = new String(word2_change);
        int leng1 = arr1.length();
        int leng2 = arr2.length();

        if(leng1==leng2){
            if(arr2.equals(arr1))
                System.out.println("Yes");
            else
                System.out.println("No");
        }else
                System.out.println("No");
    }
}