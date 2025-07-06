import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        // Please write your code here.
        Arrays.sort(words);
        List<String> newWords = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (words[i].startsWith(t)) {
                newWords.add(words[i]);
            }
        }
        
        System.out.println(newWords.get(k - 1));
    }
}