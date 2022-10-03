import java.util.Scanner;
public class T2_2_3 {
    static void printChar(char c){
        System.out.println("Symbol c = " + c + ", Binary = " + Integer.toBinaryString(c));
    }
    static long changeBit(long n, byte m){
        if(m > 64) return n;
        long bit = 1L << m;

        long w = n & bit;
        if(w>0) return n & ~w;

        return n + bit;
    }

    public static void main(String[] args){

        String s = "a" ;
        String s1 = "m";
        String s2 = " ";
        String s3 = "À";

        char c = s.charAt(0);
        char c1 = s1.charAt(0);
        char c2 = s2.charAt(0);
        char c3 = s3.charAt(0);

        printChar(c);
        printChar(c1);
        printChar(c2);
        printChar(c3);

        long n;
        byte m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        m = sc.nextByte();
        System.out.println("R = " + changeBit(n,m));
    }
}