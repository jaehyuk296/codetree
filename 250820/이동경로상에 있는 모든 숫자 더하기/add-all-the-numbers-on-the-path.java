import java.util.Scanner;

public class Main {
    public static int n;
    public static boolean inRange(int x,int y){
        return (0<=x && x<n && 0<=y && y<n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 보드 크기(홀수)
        int t = sc.nextInt(); // 명령 개수
        String commands = sc.next(); // 명령 문자열 (R, L, F)

        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int x = n/2, y = n/2; // 시작점: 중앙
        int angle = 0; // 0: 북, 90: 동, 180: 남, 270: 서
        int sum = board[x][y]; // 시작 위치 값 포함

        for(int i=0; i<t; i++) {
            char com = commands.charAt(i);

            if(com=='L') angle = (angle+270)%360;
            else if(com=='R') angle = (angle+90)%360;
            else if(com=='F') {
                int nx = x, ny = y;
                switch(angle){
                    case 0: nx = x-1; ny = y; break;   // 북
                    case 90: nx = x; ny = y+1; break;  // 동
                    case 180: nx = x+1; ny = y; break; // 남
                    case 270: nx = x; ny = y-1; break; // 서
                }
                if(inRange(nx, ny)) {
                    x = nx; y = ny;
                    sum += board[x][y];
                }
            }
        }
        System.out.println(sum);
    }
}
