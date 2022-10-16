import java.util.Random;
import java.util.Scanner;

public class T3_2_8 {
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
    static void getCofactor(int[][] matr, int[][] temp, int q, int size)
    {
        int i = 0, j = 0;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row != 0 && col != q) {
                    temp[i][j++] = matr[row][col];
                    if (j == size - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    static int determinantOfMatrix(int[][] matr, int size) {
        int det = 0;
        if (size == 1)
            return matr[0][0];
        int[][] temp = new int[size][size];
        int sign = 1;
        for (int f = 0; f < size; f++) {
            getCofactor(matr, temp, f, size);
            det += sign * matr[0][f] * determinantOfMatrix(temp, size - 1);
            sign = -sign;
        }
        return det;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix size: ");
        int size = sc.nextInt();
        int[][] matr = new int[size][size];

        System.out.println("Random matrix: ");
        fillRandomMatrix(matr, size);
        printMatrix(matr);

        System.out.printf("\nDeterminant of matrix: %d\n", determinantOfMatrix(matr, size));
    }
}
