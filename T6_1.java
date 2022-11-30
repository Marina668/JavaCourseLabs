import java.io.*;
import java.util.*;

public class T6_1{
    public static void main(String[] args) throws IOException {
        String separator = File.separator;
        Scanner textFile = new Scanner(new File(separator + "D:" + separator + "java"
                + separator + "Task 6.1" + separator + "src" + separator + "test6_2"));
        FileWriter fw = new FileWriter(separator + "D:" + separator + "java"
                + separator + "Task 6.1" + separator + "src" + separator + "outfile6_1");

        int sum = 0, count = 0;
        System.out.println("All numbers in text file :");
        while (textFile.hasNextInt()) {
            int nextInt = textFile.nextInt();
            count += 1;
            System.out.println(count + ". " +nextInt);
            sum += nextInt;
            fw.write(nextInt + " ");
        }
        System.out.println("\nTheir sum = " + sum);
        fw.close();
    }
}