import java.util.Scanner;

public class Main {
    public static int n;
    public static boolean inRange(int x,int y){
        return (0<=x&&x<n&&0<=y&&y<n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();//사이즈 홀수
        int t = sc.nextInt();//명령 개수
        String commands = sc.next();//R,L,F
        
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int x = n/2, y = n/2;//시작점 (center)
        int angle = 0; // 0: 북, 90: 동, 180: 남, 270: 서
        int sum = 0;
        
        for(int i=0;i<t;i++){//명령어 비교
            char com = commands.charAt(i);
            if(inRange(x,y))
                sum += board[x][y];
            else continue;

            if(com=='L') angle=(angle+270)%360;
            else if(com=='R') angle=(angle+90)%360;
            else if(com=='F') {
                switch(angle){
                    case 0: x--;break;
                    case 90: y++;break;
                    case 180: x++;break;
                    case 270: y--;break;
                }

            }
        }
        System.out.println(sum);
    }
}