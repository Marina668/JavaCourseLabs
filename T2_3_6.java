import java.util.Scanner;
import java.util.Random;

class test{
    static Random rnd = new Random();
    static int competitionAlice(){
        int Alice = 1;
        int first = -1;
        int second = rnd.nextInt(2);
        do{
            first = second;
            second = rnd.nextInt(2);
            Alice++;
        } while(! (first==1 && second==1)) ;
        return Alice;
    }
    static int competitionBob(){
        int Bob = 1;
        int coin = -1;
        int next= rnd.nextInt(2);
        do{
            coin = next;
            next = rnd.nextInt(2);
            Bob++;
        } while (! (coin ==1 && next==0));
        return Bob;
    }
    public static void main(String[] args){
        final int N = 1000;
        int BobWins = 0;
        for (int i=0; i<N; i++){
            int a = competitionAlice();
            int b = competitionBob();
            if(a<b){
                BobWins++;
            }
            System.out.println("ratio: " + ((double)BobWins/N));
            System.out.println("Answer: " + (39.0/121));
        }
    }
}




