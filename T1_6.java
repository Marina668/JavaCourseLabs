import java.util.Scanner;

public class T1_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть перше дійсне число: ");
        float myFloat1 = input.nextFloat();
        System.out.print("Введіть друге дійсне число: ");
        float myFloat2 = input.nextFloat();
        System.out.print(myFloat1 + myFloat2);
    }
}
