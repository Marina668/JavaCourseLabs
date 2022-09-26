import java.util.Scanner;

public class T3_20 {
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.printf("c = %f", Math.sqrt(a*a + b*b));
    }
}
