import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();
        // Please write your code here.
       
        System.out.println( find(text,pattern));
    }

    public static int find(String a,String pattern){
        int size = a.length();
        String pat [] = pattern.split("");
        String alp [] = a.split("");
        for(int i=0;i<size-1;i++){
            for(int j=0;j<pattern.length()-1;j++){
                if(alp[i].equals(pat[j])){
                    if(alp[i+1].equals(pat[j+1])){
                        int cnt=i;
                        return cnt;
                    }
                    break;
                }
            }
        }
        return -1;
    }
}