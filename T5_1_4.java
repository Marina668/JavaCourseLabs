public class T5_1_4 {
    public static void main(String[] args) {
        String s = "a cat, an apple and a cheese";
        s = s.replaceAll("\\ban? \\b", "");
        System.out.println(s);
    }
}
