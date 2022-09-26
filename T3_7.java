import java.util.Scanner;

public class T3_7 {
    public static void main(String[] args) {
        double m1 = 33.3f;
        double m2 = 44.f;
        double r = 555.f;
        double F = 6.673 * Math.pow(10, -11) * ((m1 * m2)/Math.pow(r,2));
        System.out.printf("F = %e", F);
    }
}
