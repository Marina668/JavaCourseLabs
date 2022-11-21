import java.util.Scanner;

public class T5_1_7 {
    public static void countElements(String text) {
        String sentenceRegExp = "((\\b\\w+\\b[, ]{1,2})+(\\b\\w+\\b[.?]))+";
        String wordRegExp = "\\b\\w+\\b";
        String symbolRegExp = ".";
        String specSymbolRegExp = "[,.!?]";
        String resStr;

        resStr = text.replaceAll(symbolRegExp, "#");
        long symbolsNumber = resStr.chars().filter(ch -> ch == '#').count();

        resStr = text.replaceAll(wordRegExp, "#");
        long wordsNumber = resStr.chars().filter(ch -> ch == '#').count();

        resStr = text.replaceAll(sentenceRegExp, "#");
        long sentencesNumber = resStr.chars().filter(ch -> ch == '#').count();

        resStr = text.replaceAll(specSymbolRegExp, "#");
        long specSymbolsNumber = resStr.chars().filter(ch -> ch == '#').count();

        System.out.println("Number of symbols = " + symbolsNumber);
        System.out.println("Number of words = " + wordsNumber);
        System.out.println("Number of punctuation marks = " + specSymbolsNumber);
        System.out.println("Number of sentences = " + sentencesNumber);
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
        countElements(text);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text: ");
        String console_text = input.nextLine();
        countElements(console_text);
    }
}
