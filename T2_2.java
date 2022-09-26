import java.util.Scanner;

public class T2_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введіть перше ціле число: ");
        int num1 = input.nextInt();

        int length_str = String.valueOf(num1).length();
        System.out.print("Розрядність числа методом рядків: ");
        System.out.print(length_str);

        int length_log = (int) (Math.log10(num1) + 1);
        System.out.print("\nРозрядність числа методом логарифма: ");
        System.out.print(length_log);

        System.out.print("\nВведіть друге ціле число: ");
        int num2 = input.nextInt();

        int length_str2 = String.valueOf(num2).length();
        System.out.print("Розрядність числа методом рядків: ");
        System.out.print(length_str2);

        int length_log2 = (int) (Math.log10(num2) + 1);
        System.out.print("\nРозрядність числа методом логарифма: ");
        System.out.print(length_log2);

        System.out.printf("\nСереднє гармонічне: %.2f%n", (2 / ((1 / (float) num1) + (1 / (float) num2))));
    }
}
