import mypack_t_1_2.T1_2;

public class T4_1_2 {
    protected static void printString() {
        T1_2 a = new T1_2();
        //System.out.println(a.getString());
        System.out.println("Can`t print method 'getString' from T1_2 because it`s protected");
        a.foo();
    }

    public static void main(String[] args) {
        printString();
    }
}
