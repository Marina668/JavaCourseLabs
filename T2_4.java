import java.util.Scanner;

public class T2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть дійсне число градусів Цельсія: ");
        float C = input.nextInt();
        System.out.print("F = " + (int)(9*C/5+32));
    }
}
