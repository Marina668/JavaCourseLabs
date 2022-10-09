import java.util.Scanner;

public class T3_1_4 {
    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int[] arrInt = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrInt[i] = Integer.parseInt(arr[i]);
        }
        int[] digits = new int[arr.length];
        int len = 1;
        int max_len = 1;
        int j = 0;

        for (int i = 1; i < arrInt.length; i++) {
            if (arrInt[i] != arrInt[i - 1]) {
                if (len >= max_len & len != 1) {
                    max_len = len;
                    j++;
                    digits[j] = arrInt[i - 1];
                }
                len = 1;

            } else len++;
        }
        if (len >= max_len & len != 1) {
            max_len = len;
            j++;
            digits[j] = arrInt[arrInt.length - 1];
        }
        System.out.printf("%d підряд чисел %d", max_len, getMax(digits));
    }
}
