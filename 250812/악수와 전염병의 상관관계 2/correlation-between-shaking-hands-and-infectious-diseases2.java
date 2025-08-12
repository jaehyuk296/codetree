import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//개발자 수
        int K = sc.nextInt();//k번 이내의 전염
        int P = sc.nextInt();//최초 병걸린 개발자 번호
        int T = sc.nextInt();//횟수
        int[][] shakes = new int[T][3];
        
        for (int i = 0; i < T; i++) {
            shakes[i][0] = sc.nextInt();//시간
            shakes[i][1] = sc.nextInt();//x개발자
            shakes[i][2] = sc.nextInt();//y개발자
        }
        // Please write your code here.
        Arrays.sort(shakes, (a, b) -> Integer.compare(a[0], b[0]));//시간 별 정렬
        
        int sick [] = new int [N+1];
        int contagion [] = new int [N+1];//감염횟수

        sick[P] = 1;//최초 감염자 
        contagion[P]=K; //최초 감염자 감염 횟수

        for (int i = 0; i < T; i++) {
            int x = shakes[i][1];
            int y = shakes[i][2];

            if (sick[x] == 1 && contagion[x] > 0 && sick[y] == 0) { //x감염자, y비감염자
                sick[y] = 1;//y감염
                contagion[x]--;//x의 감염횟수 감소
                contagion[y] = K;//전염
            } else if (sick[y] == 1 && contagion[y] > 0 && sick[x] == 0) {//x비감염자, y감염자
                sick[x] = 1;
                contagion[y]--;
                contagion[x] = K;
            } else if (sick[x] == 1 && sick[y] == 1) {//둘다 감염자
                if (contagion[x] > 0) contagion[x]--;
                if (contagion[y] > 0) contagion[y]--;
            }
        }
        for(int i=1;i<=N;i++){
            System.out.print(sick[i]);
        }
    }
}