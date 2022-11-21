public class T5_2_26 {
    public static void main(String[] args) {
        String str = "aabcbb";
        System.out.println(str.replaceAll("([a-z])\\1", "$1"));
    }
}
