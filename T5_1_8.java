import java.util.Scanner;

public class T5_1_8 {
    public static void isWordInText(String text, String word) {
        int res = Math.max(text.indexOf(word.toLowerCase()), text.indexOf(word.toUpperCase()));
        if (res == -1) System.out.printf("Word \"%s\" is not in the text\n", word);
        else System.out.printf("Word \"%s\" is in the text\n", word);
    }

    public static void main(String[] args) {
        String text;
        if (args.length != 0) text = String.join(" ", args);
        else text = """
                Isabella Khairiah Hadid (born October 9, 1996) is an American model.
                In 2016, she was voted "Model of the Year" by industry professionals for Models.com.
                Over the span of four years, Hadid has made twenty-seven appearances on international Vogue magazine covers.
                Born in Washington, D.C. and raised in Santa Barbara, California, Hadid began her modeling career at the age of 16.
                She was signed to IMG Models in August 2014, and made her New York Fashion Week debut the following month.
                In 2017, Hadid broke Doutzen Kroes's record for the most Vogue September covers in one year by appearing
                in five international editions (China, Spain, Brazil, Australia and Arabia).""";

        isWordInText(text,"model");
        isWordInText(text,"Hadid");
        isWordInText(text,"cat");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter text: ");
        String console_text = input.nextLine();
        System.out.println("Enter word: ");
        String console_word = input.nextLine();
        isWordInText(console_text, console_word);
    }
}
