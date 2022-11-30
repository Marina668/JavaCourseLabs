import java.io.*;
import java.util.*;

public class T6_2{
    public static void main(String[] args) throws IOException {
        String separator = File.separator;
        Scanner textFile = new Scanner(new File(separator + "D:" + separator + "java"
                + separator + "Task 6.2" + separator + "src" + separator + "task6_2"));
        FileWriter fw = new FileWriter(separator + "D:" + separator + "java"
                + separator + "Task 6.2" + separator + "src" + separator + "outfile6_2");

        double product = 1;
        int count = 0;
        System.out.println("All numbers in text file :");
        while (textFile.hasNextInt()) {
            int nextInt = textFile.nextInt();
            count += 1;
            System.out.println(count + ". " +nextInt);
            if (nextInt != 0){
                product *= Math.abs(nextInt);
                fw.write(nextInt + " ");
            }

        }
        System.out.println("\nTheir product = " + product);
        fw.close();
    }
}
