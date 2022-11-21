class TriangleSidesException extends Exception{
    public TriangleSidesException(String message){
        super(message);
    }
}

class Triangle {

    public float side1, side2, side3;

    public Triangle(float s1, float s2, float s3) throws TriangleSidesException {
        side1 = s1;
        side2 = s2;
        side3 = s3;
        if (Float.compare(side1, 0) == 0 && (Float.compare(side2, 0) != 0 || Float.compare(side3, 0) != 0) ||
                Float.compare(side2, 0) == 0 && (Float.compare(side1, 0) != 0 || Float.compare(side3, 0) != 0) ||
                Float.compare(side3, 0) == 0 && (Float.compare(side2, 0) != 0 || Float.compare(side1, 0) != 0)) {
            throw new TriangleSidesException("One of sides is len 0 in " + this);
        }

        if (Float.compare(side1, 0) != 0) {
            if ((Float.compare(side1 + side2, side3) <= 0) || (Float.compare(side1 + side3, side2) <= 0) || (Float.compare(side3 + side2, side1) <= 0)) {
                throw new TriangleSidesException("Triangle is not valid: " + this);
            }
        }
    }


    public boolean is_right() {
        return ((Float.compare(side1 * side1, (side2 * side2) + (side3 * side3)) == 0) ||
                (Float.compare(side2 * side2, (side1 * side1) + (side3 * side3)) == 0) ||
                (Float.compare(side3 * side3, (side1 * side1) + (side2 * side2)) == 0));
    }

    public boolean is_scalene() {
        return (Float.compare(side1, side2) != 0 && Float.compare(side1, side3) != 0 && Float.compare(side2, side3) != 0);
    }

    public boolean is_isosceles() {
        return ((Float.compare(side1, side2) == 0 && Float.compare(side1, side3) != 0) ||
                (Float.compare(side1, side3) == 0 && Float.compare(side1, side2) != 0) ||
                (Float.compare(side2, side3) == 0 && Float.compare(side2, side1) != 0));
    }

    public boolean is_equilateral() {
        return (Float.compare(side1, side2) == 0 && Float.compare(side1, side3) == 0);
    }

    public float count_perimeter() {
        return side1 + side2 + side3;
    }

    public float count_area() {
        float p = (float) (count_perimeter() / 2.0);
        return (float) Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public String toString() {
        return String.format("Triangle with sides: %f, %f, %f", side1, side2, side3);
    }
}

public class T3_7Exception{
    public static void main(String[] args) throws TriangleSidesException {
        Triangle[] triangles = new Triangle[]{ new Triangle(0, 0, 0), new Triangle(4, 6, 4), new Triangle(5, 5, 5), new Triangle(3, 4, 5), new Triangle(2, 2, 4), new Triangle(6, 6, 6)};
        int right = 0;
        int ind_of_biggest_area_right = 0;
        int scalene = 0;
        int ind_of_biggest_area_scalene = 0;
        int isosceles = 0;
        int ind_of_biggest_area_isosceles = 0;
        int equilateral = 0;
        int ind_of_biggest_area_equilateral = 0;

        for(int i = 0; i < triangles.length; i++){
            if (triangles[i].is_right()){
                right++;
                if (triangles[i].count_area() >= triangles[ind_of_biggest_area_right].count_area()){
                    ind_of_biggest_area_right = i;
                }
            }

            else if (triangles[i].is_scalene()){
                scalene++;
                if (triangles[i].count_area() >= triangles[ind_of_biggest_area_scalene].count_area()){
                    ind_of_biggest_area_scalene = i;
                }
            }

            else if (triangles[i].is_isosceles()){
                isosceles++;
                if (triangles[i].count_area() >= triangles[ind_of_biggest_area_isosceles].count_area()){
                    ind_of_biggest_area_isosceles = i;
                }
            }

            else if (triangles[i].is_equilateral()){
                equilateral++;
                if (triangles[i].count_area() >= triangles[ind_of_biggest_area_equilateral].count_area()){
                    ind_of_biggest_area_equilateral = i;
                }
            }
        }

        System.out.println("Amount of right triangles: " + right);
        System.out.println("Amount of scalene triangles: " + scalene);
        System.out.println("Amount of isosceles triangles: " + isosceles);
        System.out.println("Amount of equilateral triangles: " + equilateral);

        System.out.println("Biggest area of right triangles has: " + triangles[ind_of_biggest_area_right]);
        System.out.println("Biggest area of scalene triangles has: " + triangles[ind_of_biggest_area_scalene]);
        System.out.println("Biggest area of isosceles triangles has: " + triangles[ind_of_biggest_area_isosceles]);
        System.out.println("Biggest area of equilateral triangles has: " + triangles[ind_of_biggest_area_equilateral]);
    }
}