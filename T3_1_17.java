import java.util.Scanner;

public class T3_1_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[1000000];
        int left, right, m = 0, command = 0, i = 1;
        left = 0;
        right = arr.length - 1;
        System.out.println("Make a number of one to a million");
        while (command != 3) {
            m = left + (right - left) / 2;
            System.out.printf("Question number %d:\n", i);
            System.out.printf("Enter 1 if your number < %d\n Enter 2 if your number > %d\n Enter 3 if your number = %d\n", m, m, m);
            command = sc.nextInt();
            if (command == 1) {
                right = m - 1;
            } else if (command == 2) {
                left = m + 1;
            }
            i++;
        }
        System.out.printf("Your number: %d", m);
    }
}

