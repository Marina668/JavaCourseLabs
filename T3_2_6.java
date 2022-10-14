import java.util.Random;
import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class T3_2_6 {
    static void printMatrix(int[][] matr) {
        for (int[] i: matr) {
            for (int j: i) System.out.printf("%2d ", j);
            System.out.println();
        } System.out.println();
    }
    static void fillRandomMatrix(int[][] matr, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matr[j][i] = random.nextInt(2 * size + 1) - size;
            }
        }
    }

    static void  norm_1(int[][]matr) {
        int size = matr.length;
        int []sum_row = new int[size];
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                sum_row[i] += Math.abs(matr[i][j]);
            }
        }
        List<Integer> list = new LinkedList<>();
        for(int i = 0; i < sum_row.length; i++){
            list.add(sum_row[i]);
        }
        System.out.println("Row sum: " + list);
        System.out.println("Norm 1: " + Collections.max(list));
        System.out.println();
    }

    static void norm_2(int[][]matr) {
        int size = matr.length;
        int[]sum_col = new int[size];
        for(int j = 0; j < size; j++) {
            for(int i = 0; i < size; i++) {
                sum_col[j] += Math.abs(matr[i][j]);
            }
        }
        List<Integer> list = new LinkedList<>();
        for(int i = 0; i < sum_col.length; i++){
            list.add(sum_col[i]);
        }
        System.out.println("Column sum: " + list);
        System.out.println("Norm 2: " + Collections.max(list));
        System.out.println();

    }
    static void norm_3(int[][]matr) {
        int size = matr.length;
        int[]sum_col = new int[size];
        double normal_3 = 0;
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                normal_3 += Math.pow((matr[i][j]),2);
            }
        }
        System.out.println("Norm 3: " + Math.pow(normal_3, 0.5));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix size: ");
        int size = sc.nextInt();
        int[][] matr = new int[size][size];

        System.out.println("Random matrix: ");
        fillRandomMatrix(matr, size);
        printMatrix(matr);

        norm_1(matr);
        norm_2(matr);
        norm_3(matr);
    }
}