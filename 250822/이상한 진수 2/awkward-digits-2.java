import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        // Please write your code here.
        int num [] = new int [10];
        for(int i=0;i<a.length();i++){
            num[i] = a.charAt(i)-'0';
        }

        for(int i=1;i<a.length();i++){//a의 맨앞자리 0이 아님을 가정
            if(num[i]==0){
                num[i] = 1;
                break;
            }
        }
        int n = 0;
        for(int i=0;i<a.length();i++){//2진수 10진수로 변환
            n = n*2+num[i];
        }
        System.out.println(n);
    }
}