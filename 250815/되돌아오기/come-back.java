import java.util.Scanner;

public class Main {
    public static int pos(char dir){
        // 북, 동, 남, 서 순서
        if(dir=='N'){ return 0; }
        else if(dir=='E'){ return 1; }
        else if(dir=='S'){ return 2; }
        else if(dir=='W'){ return 3; }
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0; // 시작점
        // 북, 동, 남, 서
        int dx[] = {-1, 0, 1, 0};
        int dy[] = {0, 1, 0, -1};
        
        int cnt = 0; // 실행 횟수
        boolean found = false; // (0,0) 도착 여부
        
        int n = sc.nextInt(); // 명령 개수
        outer: // 라벨
        for(int i = 0; i < n; i++){
            char dir = sc.next().charAt(0);
            int dist = sc.nextInt();
            int dirIdx = pos(dir);
            for(int j = 0; j < dist; j++){
                x += dx[dirIdx];
                y += dy[dirIdx];
                cnt++;
                if(x == 0 && y == 0){
                    found = true;
                    break outer; // 전체 루프 종료
                }
            }
        }
        
        if(found)
            System.out.println(cnt);
        else
            System.out.println(-1);
    }
}
