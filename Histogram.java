import java.util.Scanner;
import java.io.*;

/**
 * Через неможливість зберігати дані для статистичної обробки, в класі зберігається інформація
 * про максимальне та мінімальне значення даних. Замість даних зберігаємо лише частоти
 * у відповідних стовпцях гістограми, кількість стовпців фіксована.
 * Для статистичного аналізу використовуємо встановлені приблизні значення для кожного стовпця:
 * (максимальне для стовпця значення + мінімальне) / 2
 * для великих масивів даних достатньо коректно відображають реальні експерементальні дані
 * Варіанти задання гістограми:
 * а) функція input() - частоти вказуються явно
 * б) функції setMax, setMin, setM - частоти по замовчуванню "0"
 * передбачено зберігання в текстовий файл та зчитування з текстового файлу
 */
public class Histogram {

    double min_hist_;       // максимальне значення даних
    double max_hist_;       // мінімальне значення даних
    int M;                  // кількість стовпців
    int[] frequency;        // замість даних - частоти у відповідних стовпцях
    double[] approx_values; // встановлені приблизні значення для кожного стовпця

    Scanner scanner = new Scanner(System.in);

    public Histogram() {}

    public Histogram(double min, double max, int M) {
        this.min_hist_ = min;
        this.max_hist_ = max;
        setM(M);
        setApprox_values();
    }

    /**
     * введення з консолі даних про мінімум, максимум, кількість стовпців та частоти
     */
    public void input() {
        System.out.print("\nM = ");
        setM(scanner.nextInt());
        System.out.print("\nmin_hist = ");
        this.min_hist_ = scanner.nextDouble();
        System.out.print("\nmax_hist = ");
        this.max_hist_ = scanner.nextDouble();
        System.out.print("\nn of data = ");
        int n = scanner.nextInt();
        System.out.print("\nway to add(1-3) = ");
        int q = scanner.nextInt();
        System.out.print("\ndata = ");
        for (int i = 0; i < n; i++) {
            double t;
            t = scanner.nextDouble();
            if (q == 1) {
                addNumber_1(t);
            } else if (q == 2) {
                addNumber_2(t);
            }
            else if (q == 3) {
                addNumber_3(t);
            }
        }
        setApprox_values();
        System.out.println("\n");
    }

    /**
     * виведення інформації про гістограму
     */
    public void print() {
        System.out.println("\n **** HISTOGRAM INFORMATION **** \n");
        System.out.println("\nM = " + M);
        System.out.println("\nmin_hist = " + min_hist_);
        System.out.println("\nmax_hist = " + max_hist_);
        System.out.println("\nfrequencies = ");
        for (int i = 0; i < M; i++) {
            System.out.println(frequency[i] + ", ");
        }
        System.out.println("\n");
    }


    public void setMin(double min_hist_) {
        this.min_hist_ = min_hist_;
    }

    public void setMax(double max_hist_) {
        this.max_hist_ = max_hist_;
    }

    public void setM(int m) {
        this.M = m;
        this.frequency = new int[m];
        for (int i = 0; i < m; i++) {
            frequency[i] = 0;
        }
    }

    public int[] getFrequency() {
        return frequency;
    }

    public void setFrequency(int[] frequency) {
        this.frequency = frequency;
    }

    public double[] getApprox_values() {
        return approx_values;
    }

    /**
     * встановити приблизні значення для кожного стовпця
     */
    public void setApprox_values() {
        this.approx_values = new double[M];
        double step = (max_hist_ - min_hist_) / (double) M;

        for (int i = 0; i < M; i++) {
            approx_values[i] = 0.5 * ((min_hist_ + step * ((double) i + 1.0)) + ((min_hist_ + step * (double) i)));
        }
    }

    /**
     * додати число. якщо число виходить за межі мін та макс - не додавати
     *
     * @param x to add
     */
    public void addNumber_1(double x) {
        if (x <= max_hist_ && x >= min_hist_) {
            double step = (max_hist_ - min_hist_) / (double) M;
            for (int i = 1; i < M + 1; i++) {
                if (min_hist_ + step * (double) i >= x) {
                    frequency[i - 1]++;
                    break;
                }
            }
        }
    }

    /**
     * додати число. якщо число виходить за межі мін та макс - додати в крайні інтервали
     *
     * @param x to add
     */
    public void addNumber_2(double x) {
        if (x <= max_hist_ && x >= min_hist_) {
            double step = (max_hist_ - min_hist_) / (double) M;
            for (int i = 1; i < M + 1; i++) {
                if (min_hist_ + step * (double) i >= x) {
                    frequency[i - 1]++;
                    break;
                }
            }
        } else if (x > max_hist_) {
            frequency[M - 1]++;
        } else {
            frequency[0]++;
        }
    }

    /**
     * додати число. якщо воно менше min_hist_ - змінює його, якщо більше max_hist_ - змінює його.
     *
     * @param x to add
     */

    public void addNumber_3(double x) {
        if (x <= max_hist_ && x >= min_hist_) {
            double step = (max_hist_ - min_hist_) / (double) M;
            for (int i = 1; i < M + 1; i++) {
                if (min_hist_ + step * (double) i >= x) {
                    frequency[i - 1]++;
                    break;
                }
            }
        } else if (x > max_hist_) {
            max_hist_ = x;
        } else {
            min_hist_ = x;
        }
    }

    /**
     * додати масив чисел.
     * якщо число виходить за межі мін та макс - не додавати
     * використовує функцію addNumber_1
     *
     * @param data to add
     */
    public void addbatch_1(double[] data) {
        for (double d : data)
            addNumber_1(d);
    }

    /**
     * додати масив чисел.
     * якщо число виходить за межі мін та макс - додати в крайні інтервали
     * використовує функцію addNumber_2
     *
     * @param data to add
     */
    public void addbatch_2(double[] data) {
        for (double d : data)
            addNumber_2(d);
    }

    /**
     * додати масив чисел.
     * якщо число виходить за межі мін та макс - додати в крайні інтервали
     * використовує функцію addNumber_3
     *
     * @param data to add
     */
    public void addbatch_3(double[] data) {
        for (double d : data)
            addNumber_3(d);
    }

    /**
     * зчитує масив чисел (або одне число) з текстового файлу
     * допустимі значення параметра way_to_add "1", "2" або "3"
     * додати масив чисел.
     * використовує функцію addbatch_1 або addbatch_2 (в залежності від параметра way_to_add)
     *
     * @param filename   to read
     * @param way_to_add 1, 2, 3
     */
    public void InputFromTxtFile(String filename, int way_to_add) {
        double[] new_data;
        double data;

        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] obj = line.split(" ");
                int count = obj.length;
                new_data = new double[count];
                new_data[0] = -9999.99;
                for (int i = 0; i < count; i++) {
                    data = Double.parseDouble(obj[i]);
                    new_data[i] = data;
                }
                if (new_data[0] == -9999.99) {
                    System.out.println("\nEmpty file\n");
                } else {
                    if (way_to_add == 1) {
                        addbatch_1(new_data);
                    } else if (way_to_add == 2) {
                        addbatch_2(new_data);
                    }
                    else {
                        addbatch_3(new_data);
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


    // ANALISE HISTOGRAM

    /**
     * @return повертає загальну кількість елементів гістограми
     */
    public int num() {
        int ans = 0;
        for (int i = 0; i < M; i++)
            ans += frequency[i];
        return ans;
    }

    /**
     * @param i to analyse
     * @return повертає кількість елементів гістограми для стовпця "і"
     */
    public int numHist(int i) {
        if (i < 0 || i > M - 1) {
            System.out.println("Wrong index");
            return 0;
        }
        return frequency[i];
    }

    /**
     * @return повертає максимальне значення гістограми
     */
    public double max() {
        return max_hist_;
    }

    /**
     * @return повертає мінімальне значення гістограми
     */
    public double min() {
        return min_hist_;
    }

    /**
     * @return повертає кількість стовпців
     */
    public int getM() {
        return M;
    }

    /**
     * @return повертає середнє значення гістограми
     */
    public double mean() {
        double ans = 0.0;
        for (int i = 0; i < M; i++)
            ans += approx_values[i] * frequency[i];
        return ans / (double) num();
    }

    /**
     * @return повертає медіану гістограми
     */
    public double median() {
        int index = num() / 2;
        int sum = 0;
        double ans;
        for (int i = 0; i < M; i++) {
            sum += numHist(i);
            if (sum >= index) {
                ans = approx_values[i];
                return ans;
            }
        }
        return -9999.0;
    }

    /**
     * @return повертає моду гістограми
     */
    public double moda() {
        int max_frequency = frequency[0];
        int index = 0;
        for (int i = 0; i < M; i++) {
            if (frequency[i] > max_frequency) {
                max_frequency = frequency[i];
                index = i;
            }
        }
        return approx_values[index];
    }

    /**
     * @return повертає розмах даних гістограми
     */
    public double range() {
        return max_hist_ - min_hist_;
    }

    /**
     * @return повертає дисперсію даних гістограми
     */
    public double variance() {
        double ans = 0.0;
        double mean_ = mean();
        for (int i = 0; i < M; ++i)
            ans += (Math.pow(approx_values[i] - mean_, 2)) * frequency[i];
        return ans / (double) M;
    }

    /**
     * @return повертає середньоквадратичне відхилення даних гістограми
     */
    public double dev() {
        return Math.sqrt(variance());
    }

    /**
     * @return повертає значення асиметрії даних гістограми
     */
    public double asymmetry() {
        int n = num();
        double m = mean();
        double moment3 = 0.0;
        for (int i = 0; i < M; i++) {
            moment3 += (Math.pow(approx_values[i] - m, 3) * frequency[i]);
        }
        moment3 /= n;
        return moment3 / Math.pow(dev(), 3);
    }

    /**
     * @return повертає значення ексцесу даних гістограми
     */
    public double excess_kurtosis() {
        int n = num();
        double m = mean();
        double moment4 = 0.0;
        for (int i = 0; i < M; i++) {
            moment4 += Math.pow(approx_values[i] - m, 4) * frequency[i];
        }
        moment4 /= n;
        return moment4 / Math.pow(dev(), 4);
    }

    /**
     * @return повертає значення середнього абсолютного відхилення
     */
    public double mad(){
        double sum = 0;
        double med = median();
        for (int i = 0; i < M; i++) {
            sum += Math.abs(approx_values[i] - med);
        }
        return 1 / (double) num() * sum;
    }

    /**
     * @param n порядок моменту
     * @return повертає значення початкового моменту n-го порядку
     */

    public double rawMoment(int n){
        if (n <= 0) throw new AssertionError();
        double sum = 0;
        for (int i = 0; i < M; i++){
            sum += Math.pow(approx_values[i], n);
        }
        return 1/(double) num() * sum;
    }

    /**
     * @param n порядок моменту
     * @return повертає значення центрального моменту n-го порядку
     */
    public double centralMoment(int n) {
        if (n <= 0) throw new AssertionError();
        double sum = 0;
        double meanV = mean();
        for (int i = 0; i < M; i++) {
            sum += Math.pow((approx_values[i] - meanV), n);
        }
        return 1 / (double) num() * sum;
    }

    /**
     * @return повертає значення стандартного відхилення
     */
    public double std() {
        return Math.sqrt(rawMoment(2));
    }

    /**
     * @return повертає значення міри асиметрії
     */
    public double skewness(){
        return centralMoment(3)/Math.pow(std(),3);
    }

}
