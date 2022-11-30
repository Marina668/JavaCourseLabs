import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class T5_5 {
    static int previousLongLine = 0;
    public void printLongLine(HashMap longLineMap) {


        Set keyofSet = longLineMap.keySet();
        Iterator itr = keyofSet.iterator();
        while (itr.hasNext()) {
            Integer keys = (Integer) itr.next();
            String value = (String) longLineMap.get(keys);
            System.out.println("Longest line: " + value);
        }
    }

    public static void main(String[] args) {

        String fname = "task5_5.txt";
        String line = null;
        int key = 0;
        int lineSize = 0, lineNumber = 0;
        T5_5 ln = new T5_5();
        HashMap longLineMap = new HashMap();

        try {
            FileReader fileReader = new FileReader(fname);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                lineNumber++;
                lineSize = line.length();
                if (lineSize > previousLongLine) {
                    previousLongLine = lineSize;
                    longLineMap.clear();
                    longLineMap.put(lineNumber, line);
                }

            }
            // Always close files.
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fname + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fname + "'");

        }

        ln.printLongLine(longLineMap);
    }

}
