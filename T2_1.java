import java.util.Scanner;

public class T2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть прізвище: ");
        String name = input.nextLine();
        System.out.print("Привіт, " + name);
    }
}
