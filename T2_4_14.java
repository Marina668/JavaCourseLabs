import java.util.Scanner;

public class T2_4_14 {
    public static void main(String[] args) {
        float x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first equation factors: ");
        System.out.print("Enter a1: ");
        float a1 = sc.nextFloat();
        System.out.print("Enter b1: ");
        float b1 = sc.nextFloat();
        System.out.print("Enter c1: ");
        float c1 = sc.nextFloat();

        System.out.println("\nEnter the second equation factors: ");
        System.out.print("Enter a2: ");
        float a2 = sc.nextFloat();
        System.out.print("Enter b2: ");
        float b2 = sc.nextFloat();
        System.out.print("Enter c2: ");
        float c2 = sc.nextFloat();

        x = (b1*c2-b2*c1)/(b1*a2-a1*b2);
        y = (a2*c1-a1*c2)/(b1*a2-a1*b2);

        System.out.printf("Result: %f, %f", x, y);
    }
}
