import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int offset = 1000;
        Scanner sc = new Scanner(System.in);
        int rect1_x1 = sc.nextInt()+offset;
        int rect1_y1 = sc.nextInt()+offset;
        int rect1_x2 = sc.nextInt()+offset;
        int rect1_y2 = sc.nextInt()+offset;

        int rect2_x1 = sc.nextInt()+offset;
        int rect2_y1 = sc.nextInt()+offset;
        int rect2_x2 = sc.nextInt()+offset;
        int rect2_y2 = sc.nextInt()+offset;
        // Please write your code here.
        int area [][] = new int [2001][2001];
        for(int i=rect1_x1;i<rect1_x2;i++){
            for(int j=rect1_y1;j<rect1_y2;j++){
                area[i][j]=1;
            }
        }

        for(int i=rect2_x1;i<rect2_x2;i++){
            for(int j=rect2_y1;j<rect2_y2;j++){
                area[i][j]=0;
            }
        }
        int max=-1;
        int ad = 0;

        for(int i=0;i<2001;i++){
            for(int j=0;j<2001;j++){
                if(area[i][j]==1)
                ad++;
            }
            if(max<ad)
                max=ad;
            ad=0;
        }

        int max2=-1;
        for(int i=0;i<2001;i++){
            for(int j=0;j<2001;j++){
                if(area[j][i]==1)
                ad++;
            }
            if(max2<ad)
                max2=ad;
            ad=0;
        }
        System.out.println(max*max2);
    }
}