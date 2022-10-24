package mypack_t_1_3;

public class T4_1_3 {
    int field1 = 1;
    public int field2;
    private int field3;
    protected int field4;

    void method1() {
        System.out.println("Simple method 1");
    }

    public void method2() {
        System.out.println("Public method 2");
    }

    private void method3() {
        System.out.println("Private method 3");
    }

    protected void method4() {
        System.out.println("Protected method 4");
    }

    public static void main(String[] args) {
        T4_1_3 object = new T4_1_3();
        object.field3 = 3;
        System.out.println(object.field3);
        object.method3();
    }
}
