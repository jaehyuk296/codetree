import java.util.Scanner;
public class Main {
    public static int N = 0;// 초기 북쪽
    public static int x=0,y=0;//시작 좌표
    //상 우 하 좌
    public static int dx[] = {0,1,0,-1};
    public static int dy[] = {1,0,-1,0};
    public static int nx = x;
    public static int ny = y;
    public static void pos(char a){
        if(a=='F'){//앞으로 1칸
            nx = x + dx[N];
            ny = y + dy[N];
            x = nx;
            y = ny;
        }else if(a=='L'){//왼쪽으로 90도 로테이션
            N=(4+N-1)%4;
        }else if(a=='R'){//오른쪽 90도 로테이션
            N=(4+N+1)%4;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.next();
        // Please write your code here.
        int cnt = 0;
        boolean check = true;
        char[] com = commands.toCharArray();
        for(int i=0;i<com.length;i++){
            pos(com[i]);
            cnt++;
            if(nx==0&&ny==0){
                check = true;
                break;
            }else{
                check = false;
            }
        }
        if(check) System.out.println(cnt);
        else System.out.println(-1);
    }
}