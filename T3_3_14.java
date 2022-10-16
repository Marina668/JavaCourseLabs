public class T3_3_14 {
    static String s = "hello";
    static String s2;

    static {
        s2 = "world";
    }

    static void print() {
        System.out.println(s);
        System.out.println(s2);
    }

    public static void main(String[] args) {
        print();
    }
}

