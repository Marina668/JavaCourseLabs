package mypack_exc;

import java.util.InputMismatchException;

public class T_exceptions {
    public static void main(String[] args) {
        double a, b, c;

        IOTool io = new IOTool();

        try {
            SqrEqn qadr1 = new SqrEqn(5, -10, 20);
            qadr1.solution();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        try {
            SqrEqn qadr2 = new SqrEqn(2, 4, 6);
            qadr2.solution();
        } catch (DiscriminantEqnException e) {
            e.printStackTrace();
        }

        try {
            SqrEqn qadr3 = new SqrEqn(0, 3, 5);
            qadr3.solution();
        } catch (SqrEqnException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Input a, b, c:");
            a = io.readDouble();
            b = io.readDouble();
            c = io.readDouble();

            SqrEqn qadr = new SqrEqn(a, b, c);
            qadr.solution();
            qadr.printRoots();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
