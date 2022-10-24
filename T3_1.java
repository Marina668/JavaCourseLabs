package mypack_t_3_1;

public class T3_1 {
    public static void main(String[] args) {
        Rational_Fraction[] arr = {new Rational_Fraction(1, 2), new Rational_Fraction(6, 5), new Rational_Fraction(9, 12), new Rational_Fraction(4, 0)};
        Rational_Fraction res = arr[0];

        for (Rational_Fraction r : arr) System.out.println(r);
        System.out.println();
        for (int i = 1; i < arr.length; i++) {
            res = res.add(arr[i]);
            System.out.println(res);
        }
    }
}
