import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test {
    FileWriter fileWriter = new FileWriter("resources/output.txt");
    PrintWriter printWriter = new PrintWriter(fileWriter);
    Scanner in = new Scanner(System.in);

    public Test() throws IOException {
    }

    void test_num(Histogram hist) {
        System.out.println("\nnumber of elements for histogram =  " + hist.num());
        printWriter.println("\nnumber of elements for histogram =  " + hist.num());
    }

    void test_max(Histogram hist) {
        System.out.println("\nmax for histogram =  " + hist.max());
        printWriter.println("\nmax for histogram =  " + hist.max());
    }

    void test_min(Histogram hist) {
        System.out.println("\nmin for histogram =  " + hist.min());
        printWriter.println("\nmin for histogram =  " + hist.min());
    }

    void test_mean(Histogram hist) {
        System.out.println("\nmean for histogram =  " + hist.mean());
        printWriter.println("\nmean for histogram =  " + hist.mean());
    }

    void test_median(Histogram hist) {
        System.out.println("\nmedian for histogram =  " + hist.median());
        printWriter.println("\nmedian for histogram =  " + hist.median());
    }

    void test_moda(Histogram hist) {
        System.out.println("\nmoda for histogram =  " + hist.moda());
        printWriter.println("\nmoda for histogram =  " + hist.moda());
    }

    void test_variance(Histogram hist) {
        System.out.println("\nvarince for histogram =  " + hist.variance());
        printWriter.println("\nvarince for histogram =  " + hist.variance());
    }

    void test_dev(Histogram hist) {
        System.out.println("\nstandart deviation for histogram =  " + hist.dev());
        printWriter.println("\nstandart deviation for histogram =  " + hist.dev());
    }

    void test_range(Histogram hist) {
        System.out.println("\nrange for histogram =  " + hist.range());
        printWriter.println("\nrange for histogram =  " + hist.range());
    }

    void test_asymmetry(Histogram hist) {
        System.out.println("\nasymmetry for histogram =  " + hist.asymmetry());
        printWriter.println("\nasymmetry for histogram =  " + hist.asymmetry());
    }

    void test_excess_kurtosis(Histogram hist) {
        System.out.println("\nexcess_kurtosis for histogram =  " + hist.excess_kurtosis());
        printWriter.println("\nexcess_kurtosis for histogram =  " + hist.excess_kurtosis());
    }

    void test_mad(Histogram hist) {
        System.out.println("\nmedian absolute deviation for histogram =  " + hist.mad());
        printWriter.println("\nmedian absolute deviation for histogram =  " + hist.mad());
    }

    void test_raw_moment(Histogram hist) {
        System.out.println("\nraw moment for histogram =  " + hist.rawMoment(1));
        printWriter.println("\nraw moment for histogram =  " + hist.rawMoment(1));
    }

    void test_central_moment(Histogram hist) {
        System.out.println("\ncentral moment for histogram =  " + hist.centralMoment(1));
        printWriter.println("\ncentral moment for histogram =  " + hist.centralMoment(1));
    }

    void test_std(Histogram hist) {
        System.out.println("\nstandard deviation for histogram =  " + hist.std());
        printWriter.println("\nstandard deviation for histogram =  " + hist.std());
    }

    void test_skewness(Histogram hist) {
        System.out.println("\nmeasure of the asymmetry for histogram =  " + hist.skewness());
        printWriter.println("\nmeasure of the asymmetry for histogram =  " + hist.skewness());
    }

    public static void main(String[] args) {
    }
}
