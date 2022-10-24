package mypack_t_1_3;

public class T1_3 extends T4_1_3 {
    public static void main(String[] args){
        T1_3 successor = new T1_3();

        System.out.println(successor.field1);
        System.out.println(successor.field2);
        System.out.println("Can't access field3, because it's private");
        System.out.println(successor.field4+"\n");

        successor.method1();
        successor.method2();
        System.out.println("Can't call method 3, because it's private");
        successor.method4();

    }
}
