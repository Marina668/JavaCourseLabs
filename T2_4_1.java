import java.util.Scanner;

public class T2_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double q = sc.nextDouble();
        double r = p / q;

        String repr = Double.toString(r);

        System.out.println(repr);

        char[] prev = new char[10];
        int k = 0;
        String answer;

        int point = repr.indexOf(".");

        if (repr.length() < point + 10) {
            answer = repr.substring(0, point);
            answer += "(";
            answer += repr.substring(point);
            answer += "(";

        } else {
            int i, j;
            boolean found = false;
            for (i = point + 1; i < repr.length(); i++) {
                char c = repr.charAt(i);
                for (j = 0; j < k; j++) {
                    if (c == prev[i]) {
                        found = true;
                        break;
                    }
                }
                if (found) break;
                prev[k++] = c;
            }
            answer = repr.substring(0, i - k);
            answer += "(";
            answer += repr.substring(i - k + 1, i - 1);
            answer += "(";
        }
        System.out.println("answer: " + answer);
    }
}
