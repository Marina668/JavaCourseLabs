import java.lang.Math;

class ComplexPoint {
    double a, b;

    ComplexPoint(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return String.format("Point(%f, %f*i)", a, b);
    }

    double distanceToPoint(ComplexPoint p) {
        return Math.sqrt(Math.pow((p.a - this.a), 2) + Math.pow((p.b - this.b), 2));
    }

    double distanceToOrigin() {
        return Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2));
    }
}

public class T4_4_8 {
    public static void main(String[] args) {
        ComplexPoint p1 = new ComplexPoint(3, 7.1);
        ComplexPoint p2 = new ComplexPoint(-2, 6);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.distanceToPoint(p2));
        System.out.println(p1.distanceToOrigin());
        System.out.println(p2.distanceToOrigin());
    }
}
