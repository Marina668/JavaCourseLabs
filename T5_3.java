import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

interface Expression {
    boolean isEqual(String s, char a);
}

public class T5_3 {

    // a)
    public static void printAllRows(String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        Scanner sc = new Scanner(fr);
        System.out.println("All rows from file: ");
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
        System.out.println();
        sc.close();
    }

    // b)
    public static void printRowsWithLength(String filename, int len) throws IOException {
        FileReader fr = new FileReader(filename);
        Scanner sc = new Scanner(fr);
        System.out.println("Print rows from file with len more than " + len + ":");
        while (sc.hasNext()) {
            String s = sc.nextLine();
            if (s.length() > len)
                System.out.println(s);
        }
        sc.close();
    }

    // c)
    public static int countFunction(String filename, Expression fun, char a) throws IOException {
        int count = 0;
        FileReader fr = new FileReader(filename);
        Scanner sc = new Scanner(fr);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            if (s.length() < 1)
                continue;
            if (fun.isEqual(s, a))
                count++;
        }
        sc.close();
        return count;

    }

    // e)
    public static int rowsWithSameLetters(String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        Scanner sc = new Scanner(fr);
        int res_num = 0;
        while (sc.hasNext()) {
            String s = sc.nextLine().replace(" ", "");
            String[] words = s.split("");
            int num = 1;
            for (int i = 0; i < words.length - 1; i++) {
                if (Objects.equals(words[i], words[i + 1])) {
                    num++;
                }
                else{
                    break;
                }

            }
            if (num == words.length){
                res_num++;
            }
        }
        sc.close();
        return res_num;
    }

    public static void main(String[] args) {

        String fname = "task5_3.txt";

        try {
            printAllRows(fname);
            printRowsWithLength(fname, 60);

            Expression startWithChar = (s, a) -> s.substring(0, 1).equals(a + "");
            char c1 = '!';
            System.out.println("\nNumber of rows start with char '" + c1 + "' = " + countFunction(fname, startWithChar, c1));

            Expression endWithChar = (s, a) -> s.substring(s.length() - 1).equals(a + "");
            char c2 = '!';
            System.out.println("\nNumber of rows end with char '" + c2 + "' = " + countFunction(fname, endWithChar, c2));

            Expression startAndEndWithChar = (s, a) -> s.substring(s.length() - 1).equals(s.substring(0, 1));
            char c3 = '!';
            System.out.println("\nNumber of rows start and end with same char = " + countFunction(fname, startAndEndWithChar, c3));

            System.out.println("\nNumber of rows with all same char = " + rowsWithSameLetters(fname));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
