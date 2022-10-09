import java.util.Scanner;

public class T2_4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        for(int i = 1; i < 1001; i++){
            if(counter == n){
                counter = 0;
                System.out.println();
            }
            System.out.printf("%3d ", i);
            counter++;
        }
    }
}
