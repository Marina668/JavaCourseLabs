import java.util.Scanner;

public class T2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть перше ціле число: ");
        int a = input.nextInt();
        System.out.print("Введіть друге ціле число: ");
        int b = input.nextInt();
        System.out.print("Введіть третє ціле число: ");
        int c = input.nextInt();
        System.out.print(a*b*c);
    }
}
