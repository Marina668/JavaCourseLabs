import java.util.*;

public class T5_1_2 {
    public static void reverseText(String text) {
        StringBuilder input = new StringBuilder();
        input.append(text);
        System.out.println(String.join(" ", input.reverse()));
    }

    public static void main(String[] args) {
        String text = "t w e n t y";;
        reverseText(text);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text: ");
        String console_text = input.nextLine();
        reverseText(console_text);
    }
}
