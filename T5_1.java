import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class T5_1 {

    // a)
    public static String longestWord(String filename) throws IOException {
        String max_word = "";
        FileReader fr = new FileReader(filename);
        Scanner sc = new Scanner(fr);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] words = s.split("\\s+");
            for (String word : words) {
                if (word.length() > max_word.length()) {
                    max_word = word;
                }
            }
        }
        sc.close();
        return max_word;

    }

    // b)
    public static int numberWordsInFile(String filename) throws IOException {
        int num = 0;
        FileReader fr = new FileReader(filename);
        Scanner sc = new Scanner(fr);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] words = s.split("\\w+");
            num += words.length;
        }
        sc.close();
        return num;

    }

    //c
    public static void replaceSpaceAndOneLetterWords(String filename, String outfilename) throws IOException {
        FileReader fr = new FileReader(filename);
        Scanner sc = new Scanner(fr);
        FileWriter fw = new FileWriter(outfilename);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] words = s.split("\\s+");
            for (String w : words) {
                if (w.length() > 1)
                    fw.write(w + " ");
            }
            fw.write("\n");
        }
        System.out.println("Replace Space And One Letter Words");
        fw.close();
        sc.close();
    }


    // d)
    public static void replaceSpace(String filename, String outfilename) throws IOException {
        FileReader fr = new FileReader(filename);
        Scanner sc = new Scanner(fr);
        FileWriter fw = new FileWriter(outfilename);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] words = s.split("\\s+");
            String new_str = String.join(" ", words);
            fw.write(new_str.trim() + "\n");
        }
        System.out.println("Replace Spaces");
        fw.close();
        sc.close();
    }

    // e)
    public static void justification(String filename, String outfilename) throws IOException {
        FileReader fr = new FileReader(filename);
        Scanner sc = new Scanner(fr);
        FileWriter fw = new FileWriter(outfilename);

        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] words = s.trim().split("\\s+");

            int symbols = s.length();
            int k_words = words.length;

            for (String w : words) {
                fw.write(w);
                if (words.length == 1)
                    break;
                int m = (80 - symbols) / (k_words - 1);
                for (int i = 0; i < m; i++)
                    fw.write(" ");
            }
            fw.write("\n");

        }
        System.out.println("Justification File");
        fw.close();
        sc.close();

    }


    public static void main(String[] args) {
        String fname = "task5_1.txt";
        String fout = "task5_1_out.txt";

        try {

            System.out.println("The longest Word: " + longestWord(fname));
            System.out.println("Number of words in file: " + numberWordsInFile(fname));
            replaceSpaceAndOneLetterWords(fname, fout);
            replaceSpace(fname, fout);
            justification(fname, fout);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
