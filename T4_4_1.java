import mypack_t_4_1.Polynom;
import mypack_t_4_1.RationalNumber;

public class T4_4_1 {
    public static void main(String[] args) {
        RationalNumber[] coeffs1 = { new RationalNumber(0, 3), new RationalNumber(2, 4), new RationalNumber(3, 4) };
        Polynom p1 = new Polynom(coeffs1);

        RationalNumber[] coeffs2 = { new RationalNumber(2,6), new RationalNumber(3,5), new RationalNumber(4,4) };
        Polynom p2 = new Polynom(coeffs2);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println("Sum: ");
        System.out.println(p1.add(p2));
    }
}
