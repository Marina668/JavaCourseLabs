import java.util.Scanner;
public class T3_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        double[] arrDouble = new double[arr.length];
        double total = 0;
        for(int i = 0; i < arr.length; ++i){
            arrDouble[i] = Double.parseDouble(arr[i]);
            total = total + arrDouble[i];
        }

        double mean = total / arrDouble.length;
        double standardDeviation = 0;
        for(double num: arrDouble) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        System.out.printf("Mean = %f", mean);
        System.out.printf("Standard deviation = %f", Math.sqrt(standardDeviation/arrDouble.length));
    }
}
