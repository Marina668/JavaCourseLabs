package mypack_t_4_1;
public class IntegerNumber {
    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}
