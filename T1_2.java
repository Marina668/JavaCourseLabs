package mypack_t_1_2;

public class T1_2 {
    String s = "String from class in package";
    protected String getString() {
        return s;
    }
    public void foo() {
        System.out.println(getString());
    }
}
