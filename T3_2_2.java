import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class T3_2_2 {
    static void printMatrix(int[][] matr) {
        for (int[] i: matr) {
            for (int j: i) System.out.printf("%2d ", j);
            System.out.println();
        }
        System.out.println();
    }
    static void fillRandomMatrix(int[][] matr, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matr[j][i] = random.nextInt(2 * size + 1) - size;
            }
        }
    }

    static int[][] cyclicShift(int[][] matr, int k, String direction) {
        int size = matr.length;
        k = k % size;
        int[][] new_matr = new int[size][size];

        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++) {
                if (Objects.equals(direction, "up")) new_matr[i][j] = matr[(i + k) % size][j];
                if (Objects.equals(direction, "down")) new_matr[i][j] = matr[(i + size - k) % size][j];
                if (Objects.equals(direction, "right")) new_matr[i][j] = matr[i][(j + size - k) % size];
                if (Objects.equals(direction, "left")) new_matr[i][j] = matr[i][(j + k) % size];
            }

        return new_matr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix size: ");
        int size = sc.nextInt();
        int[][] matr = new int[size][size];

        System.out.println("Random matrix: ");
        fillRandomMatrix(matr, size);
        printMatrix(matr);

        System.out.println("Shifted matrices: ");
        printMatrix(cyclicShift(matr, 1, "up"));
        printMatrix(cyclicShift(matr, 1, "down"));
        printMatrix(cyclicShift(matr, 1, "right"));
        printMatrix(cyclicShift(matr, 1, "left"));
    }
}
