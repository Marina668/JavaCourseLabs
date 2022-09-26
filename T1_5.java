import java.util.Scanner;

public class T1_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter float: ");
        float myFloat = input.nextFloat();

        System.out.print("Enter double: ");
        double myDouble = input.nextDouble();

        System.out.print("Enter text: ");
        String myString = input.nextLine();

        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myString);

    }
}
