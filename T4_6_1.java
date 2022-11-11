package mypack_t_6_1;

public class T4_6_1 {
    public static void main(String[] args){
        Flower[] flowers = {new Rose(10, "red", 10, "07.11.2022"),
                new Rose(9, "yellow", 15, "06.11.2022"),
                new Daisy(15, "white", 7, "06.11.2022"),
                new Lily(20, "orange", 19, "05.11.2022")};

        Bouquet bouquet = new Bouquet(flowers);
        bouquet.add_flower(new Tulip(11, "purple", 16, "01.11.2022"));
        bouquet.sort_by_date();

        System.out.println("Bouquet sorted by condition:\n" + bouquet);
        System.out.println("Flower with length 13-16:\n" + bouquet.get_by_length(13, 16));
    }
}
