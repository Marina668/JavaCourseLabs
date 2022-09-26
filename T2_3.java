import java.util.Scanner;
import static java.lang.Math.sqrt;

public class T2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        System.out.print("Середнє геометричне: \n" + sqrt(a*b));
    }
}
