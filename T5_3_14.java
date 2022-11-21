import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T5_3_14 {
    public static int first(String str) {
        Pattern pattern = Pattern.compile(" ");
        String[] words = pattern.split(str);
        int counter = 0;
        for (String word : words) {
            counter++;
        }
        return counter;
    }

    public static int second(String str) {
        Pattern pattern = Pattern.compile("\\s[0-9](\\w*)");
        Matcher matcher = pattern.matcher(str);
        int counter = 0;
        while (matcher.find()) {
            counter++;
            System.out.println(matcher.group());
        }
        return counter;
    }

    public static int third(String str) {
        Pattern pattern = Pattern.compile("\\s(\\w*)[0-9]{3}");
        Matcher matcher = pattern.matcher(str);
        int counter = 0;
        while (matcher.find()) {
            counter++;
            System.out.println(matcher.group());
        }
        return counter;
    }

    public static int forth(String str) {
        Pattern pattern = Pattern.compile("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}");
        Matcher matcher = pattern.matcher(str);
        int counter = 0;
        while (matcher.find()) {
            counter++;
            System.out.println(matcher.group());
        }
        return counter;
    }

    public static void main(String[] args) {
        String str = "cat 7seven love101 apple bella 4ever error404 marina.k.kost@gmail.com";

        System.out.println("Number of words = " + first(str));
        System.out.println("Number of words which start from number = " + second(str));
        System.out.println("Number of words which end with three numbers = " + third(str));
        System.out.println("Number of words which email addresses = " + forth(str));
    }
}
