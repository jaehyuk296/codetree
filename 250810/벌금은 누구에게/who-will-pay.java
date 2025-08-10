import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] penalizedPerson = new int[m];

        int id [] = new int [n+1];
        for(int i=1;i<=n;i++){
            id[i]=0;//학생수
        }

        for (int i = 0; i < m; i++) {
            penalizedPerson[i] = sc.nextInt();
            id[penalizedPerson[i]]++;
            if(id[penalizedPerson[i]]==k){
                System.out.println(penalizedPerson[i]);
                return;
            }
        }
        // Please write your code here.
        System.out.println(-1);

    }
}