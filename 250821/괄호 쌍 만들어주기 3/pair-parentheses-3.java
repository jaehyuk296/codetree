import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // Please write your code here.
        int op = 0; // 여는 괄호 세기
        int cl = 0; //닫는 괄호 
        int total = 0; // 괄호의 쌍
        for(int i=0;i<str.length();i++){
            char a = str.charAt(i);
            if(a == '('){
                op++;
            }else{
                cl++;
                if(op != 0){
                    total += op * cl;
                    cl=0;
                }else{
                    cl--;
                }
            }
        }
        System.out.println(total);
    }
}