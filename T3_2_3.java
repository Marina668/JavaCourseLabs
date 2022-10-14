import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class T3_2_3 {
    static void printMatrix(int[][] matr) {
        for (int[] i : matr) {
            for (int j : i) System.out.printf("%2d ", j);
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

    public static void MaxAmountNumb(int[][] matr) {
        int[] matr_array = new int[matr.length * matr.length];
        int c = 0;
        for (int[] i : matr) {
            for (int j : i) {
                matr_array[c] = j;
                c++;
            }
        }

        int count_increase = 0;
        int max = 0;

        int count_decrease = 0;
        int min = 0;

        for (int i = 0; i < matr_array.length - 1; i++) {
            if (matr_array[i + 1] > matr_array[i]) {
                count_increase += 1;
                if (count_increase > max) {
                    max = count_increase;
                }

            } else {
                count_increase = 0;
            }

            if (matr_array[i] > matr_array[i + 1]) {
                count_decrease += 1;
                if (count_decrease > min) {
                    min = count_decrease;
                }
            } else {
                count_decrease = 0;
            }
        }

        System.out.printf("Amount of numbers in max sequence of increasing numbers: %d", (max + 1));
        System.out.printf("\nAmount of numbers in max sequence of decreasing numbers: %d", (min + 1));
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
        MaxAmountNumb(matr);
    }
}
