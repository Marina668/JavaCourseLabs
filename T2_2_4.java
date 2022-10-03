import java.util.Scanner;

public class T2_2_4 {
    public static int modifyBit(int n, int p, int b)
    {
        int mask = 1 << p;
        return (n & ~mask) |
                ((b << p) & mask);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String bit = Integer.toBinaryString(n);
        System.out.println(modifyBit(n,m, ~Integer.parseInt(String.valueOf(bit.charAt(m)))));

    }
}
