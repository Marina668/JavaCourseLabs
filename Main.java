import java.io.IOException;
import java.util.Scanner;

/**
 * Проект на тему Задача Гістограма
 * студентки 3-го курсу
 * групи комп'ютерна математика 2
 * Костюченко Марини
 * Дата: 14.12.2022
 */


public class Main {

    public static void testFunctions(Histogram histogram) throws IOException {
        Test test = new Test();
        test.test_max(histogram);
        test.test_min(histogram);
        test.test_num(histogram);
        test.test_mean(histogram);
        test.test_median(histogram);
        test.test_moda(histogram);
        test.test_range(histogram);
        test.test_variance(histogram);
        test.test_dev(histogram);
        test.test_asymmetry(histogram);
        test.test_excess_kurtosis(histogram);
        test.test_mad(histogram);
        test.test_raw_moment(histogram);
        test.test_central_moment(histogram);
        test.test_std(histogram);
        test.test_skewness(histogram);
        test.printWriter.close();
    }


    public static void ConsoleRequest() throws IOException {
        Histogram histogram1 = new Histogram();
        histogram1.input();

        System.out.println("\nhistogram1");
        histogram1.print();

        System.out.println("**** ANALYSIS OF HISTOGRAM ****");
        testFunctions(histogram1);
    }

    public static void TextRequest() throws IOException {
        Scanner scanner = new Scanner(System.in);

        String data1 = "resources/data.txt";

        System.out.print("\nM = ");
        int M = scanner.nextInt();
        System.out.print("\nmin_hist = ");
        double min_hist_ = scanner.nextDouble();
        System.out.print("\nmax_hist = ");
        double max_hist_ = scanner.nextDouble();
        System.out.print("\nway to add(1-3) = ");
        int q = scanner.nextInt();

        Histogram histogram2 = new Histogram(min_hist_, max_hist_, M);

        histogram2.InputFromTxtFile(data1, q);
        System.out.println("\nhistogram2");
        histogram2.print();

        System.out.println("**** ANALYSIS OF HISTOGRAM ****");
        testFunctions(histogram2);
    }


    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("введіть запит:\n 1 - ввід з консолі\n 2 - ввід з текстового файлу");

        int request = scanner.nextInt();

        if (request == 1) {

            ConsoleRequest();

        } else if (request == 2) {

            TextRequest();

        } else {
            System.out.println("Incorrect number");
        }
    }
}