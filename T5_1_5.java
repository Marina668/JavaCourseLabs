public class T5_1_5 {
    public static void main(String[] args) {
        String s = "large dog and small cat";
        String[] replace_str = {"small", "large"};
        for (String rep: replace_str) s = s.replaceAll(rep, "very " + rep);
        System.out.println(s);
    }
}
