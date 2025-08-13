import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.
        int size =  s.length();
        char [] change = new char [size+1];
        int x=0,y=0;
        int angle=0;//시작 북쪽을 향함
        int now = y;

        for(int i=0;i<size;i++){
            change[i] = s.charAt(i);
            if(change[i]=='L'){
                angle+=270;
                switch(angle%360){
                    case 0://북
                        now=y;
                    case 90://동
                        now = x;
                    case 180://남
                        now=y;
                    case 270://서
                        now = x;
                }
            }else if(change[i]=='R'){
                angle+=90;
                switch(angle%360){
                    case 0://북
                        now=y;
                    case 90://동
                        now = x;
                    case 180://남
                        now=y;
                    case 270://서
                        now = x;
                }
            }else if(change[i]=='F'){
                if(angle==0||angle==90){
                    now++;
                    if(angle==0){
                        y=now;
                    }else{
                        x=now;
                    }
                }else if(angle==180||angle==270){
                    now--;
                     if(angle==180){
                        y=now;
                    }else{
                        x=now;
                    }
                }
            }
        }
        System.out.println(x+" "+y);
    }
}