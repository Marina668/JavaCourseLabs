package mypack_t_3_1;

public class Rational_Fraction extends Number {
    public int m;
    public int n;

    public Rational_Fraction(int m, int n) throws ArithmeticException {
        ArithmeticException ArithmeticException = new ArithmeticException("Can't be zero");
        try {
            if (m == 0 || n == 0) {
                throw ArithmeticException;
            }
            this.m = m / gcd(m, n);
            this.n = n / gcd(m, n);
        } catch (ArithmeticException e) {
            System.out.println(m + "/" + n + " " + e.getMessage());
        }
    }

    public Rational_Fraction add(Rational_Fraction other) throws ArithmeticException {
        ArithmeticException ArithmeticException = new ArithmeticException("Zero Add");
        try {
            if (other.n == 0 || other.m == 0) {
                throw ArithmeticException;
            }
            return new Rational_Fraction(this.m * other.n + this.n * other.m, this.n * other.n);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return new Rational_Fraction(m, n);
    }

    public Rational_Fraction sub(Rational_Fraction other) throws ArithmeticException {
        ArithmeticException ArithmeticException = new ArithmeticException("Zero sub");
        try {
            if (other.n == 0 || other.m == 0) {
                throw ArithmeticException;
            }
            return new Rational_Fraction(this.m * other.n - this.n * other.m, this.n * other.n);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return new Rational_Fraction(m, n);
    }

    public Rational_Fraction mul(Rational_Fraction other) throws ArithmeticException {
        ArithmeticException ArithmeticException = new ArithmeticException("Multiply zero");
        try {
            if (other.n == 0 || other.m == 0) {
                throw ArithmeticException;
            }
            return new Rational_Fraction(this.m * other.m, this.n * other.n);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return new Rational_Fraction(m, n);
    }

    public Rational_Fraction div(Rational_Fraction other) throws ArithmeticException {
        ArithmeticException ArithmeticException = new ArithmeticException("Divide zero");
        try {
            if (other.n == 0 || other.m == 0) {
                throw ArithmeticException;
            }
            return new Rational_Fraction(this.m * other.n, this.n * other.m);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return new Rational_Fraction(m, n);
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    @Override
    public String toString() {
        return m + "/" + n;
    }

    @Override
    public int intValue() {
        return (int) m / n;
    }

    @Override
    public long longValue() {
        return (long) m / n;
    }

    @Override
    public float floatValue() {
        return (float) m / n;
    }

    @Override
    public double doubleValue() {
        return (double) m / n;
    }
}

