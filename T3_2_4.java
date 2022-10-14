import java.util.Random;
import java.util.Scanner;

public class T3_2_4 {
    static void printMatrix(int[][] matr) {
        for (int[] i: matr) {
            for (int j: i) System.out.printf("%2d ", j);
            System.out.println();
        }
    }
    static void fillRandomMatrix(int[][] matr, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matr[j][i] = random.nextInt(2 * size + 1) - size;
            }
        }
    }
    static int sumBetweenPositive(int[][] matr) {
        int sum = 0, temp = 0, sign;
        boolean bool = false;

        for (int[] row : matr) {
            for (int i : row) {
                sign = Integer.signum(i);
                if (sign == -1 && bool) temp += i;
                else if (sign == 1 || sign == 0) {
                    if (bool) {
                        bool = false;
                        break;
                    } else bool = true;
                }
            }
            if (bool) bool = false;
            else sum += temp;
            temp = 0;
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix size: ");
        int size = sc.nextInt();
        int[][] matr = new int[size][size];

        System.out.println("Random matrix: ");
        fillRandomMatrix(matr, size);
        printMatrix(matr);
        System.out.println();
        System.out.println("Sum between 2 positive: " + sumBetweenPositive(matr));
    }
}
