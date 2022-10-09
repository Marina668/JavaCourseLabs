import java.util.Scanner;

public class T3_1_5 {
    static double calc_distance(float x1, float y1, float z1, float x2, float y2, float z2) {
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1) + (z2 - z1) * (z2 - z1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coordinates of point A\n");
        System.out.print("Enter x: ");
        float x = sc.nextFloat();
        System.out.print("Enter y: ");
        float y = sc.nextFloat();
        System.out.print("Enter z: ");
        float z = sc.nextFloat();

        System.out.print("\nMassive of points xi, yi, zi");
        System.out.print("\nEnter the number of points: ");
        int n = sc.nextInt();

        float[] xi = new float[n];
        float[] yi = new float[n];
        float[] zi = new float[n];

        float min_distance = 1000000000;
        int min_ind = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("\nEnter x%d: ", (i + 1));
            xi[i] = sc.nextFloat();
            System.out.printf("Enter y%d: ", (i + 1));
            yi[i] = sc.nextFloat();
            System.out.printf("Enter z%d: ", (i + 1));
            zi[i] = sc.nextFloat();
        }

        for (int i = 0; i < n; i++) {
            double d_distance = calc_distance(x, y, z, xi[i], yi[i], zi[i]);
            float distance = (float) d_distance;

            if (distance < min_distance) {
                min_distance = distance;
                min_ind = i;
            }
        }
        System.out.printf("\nClosest point: (%f, %f, %f)\n", xi[min_ind], yi[min_ind], zi[min_ind]);
    }
}
