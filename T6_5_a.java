import java.io.*;
import java.util.*;

public class T6_5_a {
    public static void main(String[] args) throws IOException {
        String separator = File.separator;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements :");
        int n = sc.nextInt();
        Scanner textFile = new Scanner(new File(separator + "D:" + separator + "java"
                + separator + "Task 6.5" + separator + "src" + separator + "test6_5"));
        FileWriter fw1 = new FileWriter(separator + "D:" + separator + "java"
                + separator + "Task 6.5" + separator + "src" + separator + "outfile6_5_a");

        int count1 = 0, max1 = -2147483648, i1 = 0;
        System.out.println("All numbers in text file :");
        while (textFile.hasNextInt()) {
            int nextInt = textFile.nextInt();
            count1 += 1;
            i1 += 1;
            System.out.println(i1 + ". " + nextInt);
            if (nextInt > max1) {
                max1 = nextInt;
            }
            if (count1 == n) {
                fw1.write(max1 + " ");
                count1 = 0;
                max1 = -2147483648;
            }
        }
        fw1.close();

    }
}