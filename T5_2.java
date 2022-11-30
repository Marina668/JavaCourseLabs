import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class T5_2 {

    // a)
    public static int emptyRows(String filename) throws IOException {
        int emp = 0;
        FileReader fr = new FileReader(filename);
        Scanner sc = new Scanner(fr);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            if (s.equals(""))
                emp++;
        }
        sc.close();
        return emp;

    }

    // b)
    public static int longestRow(String filename) throws IOException {
        int max_len = 0;
        FileReader fr = new FileReader(filename);
        Scanner sc = new Scanner(fr);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            if (s.length() > max_len)
                max_len = s.length();
        }
        sc.close();
        return max_len;

    }

    public static void main(String[] args) {
        String fname = "task5_2.txt";

        try {
            System.out.println("Number of empty rows: " + emptyRows(fname));
            System.out.println("Len of the longest rows: " + longestRow(fname));


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

