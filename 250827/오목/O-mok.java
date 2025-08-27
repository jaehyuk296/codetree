import java.util.Scanner;

public class Main {
    public static int[][] arr;

    // 4방향 (가로, 세로, 2개의 대각선)을 탐색하는 방향 배열
    public static int[] dx = {0, 1, 1, 1}; // 가로, ↘, 세로, ↙
    public static int[] dy = {1, 0, 1, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = new int[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < 19; j++) {
            for (int i = 0; i < 19; i++) {
                if (arr[i][j] != 0) {
                    for (int k = 0; k < 4; k++) {
                        int count = 1;
                        int nx = i + dx[k];
                        int ny = j + dy[k];

                        while (nx >= 0 && nx < 19 && ny >= 0 && ny < 19 && arr[nx][ny] == arr[i][j]) {
                            count++;
                            nx += dx[k];
                            ny += dy[k];
                        }
                        
                        if (count == 5) {
                            // 6목 검사 (뒤돌아보기)
                            int prevX = i - dx[k];
                            int prevY = j - dy[k];
                            if (prevX >= 0 && prevX < 19 && prevY >= 0 && prevY < 19 && arr[prevX][prevY] == arr[i][j]) {
                                continue;
                            }
                            
                            // 승리한 돌의 색깔 출력
                            System.out.println(arr[i][j]);

                            // 5개 중 가운데 돌의 좌표를 계산하여 출력
                            // 시작점 (i, j)에서 2칸 떨어진 위치가 가운데
                            int midX = i + dx[k] * 2;
                            int midY = j + dy[k] * 2;
                            System.out.println((midX + 1) + " " + (midY + 1));
                            return; // 승리 후 프로그램 종료
                        }
                    }
                }
            }
        }

        System.out.println(0);
        sc.close();
    }
}