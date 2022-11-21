import java.util.*;

public class T5_1_1 {
    public static void countWords(String text) {
        if (Objects.equals(text, "")) System.out.println(text.length());
        else System.out.println(text.split("\\s+").length);
    }

    public static void main(String[] args) {
        String text = "white  black bella  hadid  cat boost";
        countWords(text);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text: ");
        String console_text = input.nextLine();
        countWords(console_text);
    }
}