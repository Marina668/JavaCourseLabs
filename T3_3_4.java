class Class3_4 {
    public Class3_4() {
        System.out.println("hello world");
    }

    public Class3_4(String name) {
        this();
        System.out.println(name);
    }
}

public class T3_3_4 {
    public static void main(String[] args) {
        Class3_4 t = new Class3_4("hello");
    }
}
