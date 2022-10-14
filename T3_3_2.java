class Class3_2 {
    String s = "qwerty";
    String s2;

    public Class3_2() {
        s2 = "qwerty";
    }

    void print() {
        System.out.println(s);
        System.out.println(s2);
    }
}

public class T3_3_2 {
    public static void main(String[] args) {
        Class3_2 c = new Class3_2();
        c.print();
    }
}
