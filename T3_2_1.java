import java.util.Random;
import java.util.Scanner;

public class T3_2_1 {
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
    static int[][] arrangeRows(int[][] matr, int k) {
        int n = matr.length;
        int[][] res = matr.clone();
        k--;

        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (res[j][k] > res[j + 1][k]) {
                    int[] temp = res[j];
                    res[j] = res[j + 1];
                    res[j + 1] = temp;
                }
        return res;
    }
    static int[][] arrangeColumns(int[][] matr, int k) {
        int n = matr.length;
        int[][] res = matr.clone();
        k--;

        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (res[k][j] > res[k][j + 1]) {
                    for (int s = 0; s < res[k].length; s++){
                        int temp = res[s][j];
                        res[s][j] = res[s][j + 1];
                        res[s][j + 1] = temp;
                    }
                }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix size: ");
        int size = sc.nextInt();
        int[][] matr = new int[size][size];

        System.out.println("Random matrix: ");
        fillRandomMatrix(matr, size);
        printMatrix(matr);

        System.out.println("\nMatrix with arranged rows: ");
        printMatrix(arrangeRows(matr, 3));
        System.out.println("\nMatrix with arranged columns: ");
        printMatrix(arrangeColumns(matr, 3));
    }
}