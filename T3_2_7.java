import java.util.Random;
import java.util.Scanner;

public class T3_2_7 {
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

    static int[][] rotateMatrix_90(int[][]matr) {
        int size = matr.length;
        int[][] rotated = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rotated[i][j] = matr[j][size - i - 1];
            }
        }
        return rotated;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix size: ");
        int size = sc.nextInt();
        int[][] matr = new int[size][size];

        System.out.println("Random matrix: ");
        fillRandomMatrix(matr, size);
        printMatrix(matr);

        System.out.println("\nRotated 90° matrix: ");
        printMatrix(rotateMatrix_90(matr));

        System.out.println("\nRotated 180° matrix: ");
        printMatrix(rotateMatrix_90(rotateMatrix_90(matr)));

        System.out.println("\nRotated 270° matrix: ");
        printMatrix(rotateMatrix_90(rotateMatrix_90(rotateMatrix_90(matr))));
    }
}