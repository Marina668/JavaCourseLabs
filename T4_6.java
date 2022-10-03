/* пункт в
 */

import java.util.Scanner;

public class T4_6 {
    public static double softSign(double x){
        return x/(1+Math.abs(x));
    }
    public static double softSign_derivative(double x){
        return 1/Math.pow((1+Math.abs(x)), 2);
    }
    public static void main(String[] args) {
        double x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        System.out.println(softSign(x));
        System.out.println(softSign_derivative(x));
    }
}
