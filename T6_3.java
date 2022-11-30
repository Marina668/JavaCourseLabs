import java.io.*;
import java.util.*;

public class T6_3{
    public static void main(String[] args) throws IOException {
        String separator = File.separator;
        Scanner textFile = new Scanner(new File(separator + "D:" + separator + "java"
                + separator + "Task 6.3" + separator + "src" + separator + "test6_2"));
        FileWriter fw = new FileWriter(separator + "D:" + separator + "java"
                + separator + "Task 6.3" + separator + "src" + separator + "outfile6_3");

        double product = 1;
        int count = 0;
        System.out.println("All numbers in text file :");
        while (textFile.hasNextInt()) {
            int nextInt = textFile.nextInt();
            count += 1;
            System.out.println(count + ". " +nextInt);
            if (count%2 == 0){
                product *= nextInt;
                fw.write(nextInt + " ");
            }

        }
        System.out.println("\n Product of paired elements = " + product);
        fw.close();
    }
}