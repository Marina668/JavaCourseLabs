import java.util.Scanner;

public class T2_2_14 {
    public static void main(String[] args) {
        int mask = 0xFFFFFFFF;
        int x = 0x22845678;
        int length = String.valueOf(Integer.toBinaryString(mask)).length() - String.valueOf(Integer.toBinaryString(x)).length();
        int first = x >> (24 - length);
        if (length < 16) {
            int midle = (x >> 8) & ((int) Math.pow(2, 16 - length) - 1);
            int last = x & (255 - length);
            int len_last = Integer.toBinaryString(last).length();
            String result = Integer.toBinaryString(last) + Integer.toBinaryString(midle) + Integer.toBinaryString(first);
            System.out.println(Integer.parseInt(result, 2) + "\n");
        }
        else {
            int last = x & (255 - length);
            String result = Integer.toBinaryString(last) + Integer.toBinaryString(first);
            System.out.println(Integer.parseInt(result, 2) + "\n");
        }

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        String s = Integer.toBinaryString(m);
        System.out.println(s);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int res = ((1 << i) | (1 << j)) ^ m;
        System.out.println(res);
        System.out.printf("%x", res);
    }
}
