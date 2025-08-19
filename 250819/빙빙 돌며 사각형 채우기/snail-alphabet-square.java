import java.util.Scanner;
public class Main {
    public static int N;
    public static int M;
    public static int dx [] = {0,1,0,-1};
    public static int dy [] = {1,0,-1,0};// 오, 하, 좌, 상
    public static char grid [][];

    static boolean inRange(int x, int y) {
        return (0 <= x && x < N && 0 <= y && y < M);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        // Please write your code here.
        grid = new char [N][M];
        int x=0,y=0; //시작점
        int dir = 0;//오른쪽으로

        for(int i=0;i<N*M;i++){
            grid[x][y] = (char)('A' + (i % 26));
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            
            if(!inRange(nx,ny)||grid[nx][ny]!='\0'){
                dir = (dir+1)%4;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }
            x = nx;
            y = ny;
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}