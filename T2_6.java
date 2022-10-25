import mypack_t_2_6.*;
import java.util.*;

public class T2_6 {
    // a)
    static void printNumbersOfRooms(House[] st, int numbers_of_rooms) {
        System.out.printf("Houses with %d rooms:\n", numbers_of_rooms);
        for (House s : st) {
            if (Objects.equals(s.getNumber_of_rooms(), numbers_of_rooms)) {
                s.show();
            }
        }
    }

    // b)
    static void getHousesWithNumberOfRooms(House[] st, int numbers_of_rooms, int floor1, int floor2) {
        System.out.printf("Houses with %d rooms from %d to %d floor:\n", numbers_of_rooms, floor1, floor2);
        for (House s : st) {
            if (Objects.equals(s.getNumber_of_rooms(), numbers_of_rooms) && (floor1 < s.getFloor() && s.getFloor() < floor2)) {
                s.show();
            }
        }
    }

    // c)
    static void getHousesWithArea(House[] st, int area) {
        System.out.printf("Houses with area larger than %d:\n", area);
        for (House s : st) {
            if (s.getArea() > area) {
                s.show();
            }
        }
    }


    public static void main(String[] args) {
        int N = 3;
        House[] arr = new House[N];

        for (int i = 0; i < N; i++) {
            arr[i] = new House();
            arr[i].input();
            System.out.println();
        }

        System.out.println();
        printNumbersOfRooms(arr, 3);
        getHousesWithNumberOfRooms(arr, 3, 1, 5);
        getHousesWithArea(arr, 100);
    }
}
