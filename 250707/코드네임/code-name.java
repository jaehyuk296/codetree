import java.util.Scanner;

class Player{
    char id;
    int score;

    public Player(){
        this.id='Z';
        this.score=101;
    }

    public Player(char id,int score){
        this.id=id;
        this.score=score;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        int min=101;
        
        Player[] player = new Player[5];

        for(int i=0;i<5;i++){
            char id = sc.next().charAt(0);
            int score= sc.nextInt();
            player[i]=new Player(id,score);
            if(min>score)
                min=score;
        }

        for(int i=0;i<5;i++){
            if(player[i].score==min){
                System.out.print(player[i].id+" "+player[i].score);
                break;
                }
        }

    }
}