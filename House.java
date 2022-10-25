package mypack_t_2_6;

import java.util.Scanner;

public class House {
    private int id;
    private int number_of_apartment;
    private int area;
    private int floor;
    private int number_of_rooms;
    private String street;
    private String type_of_building;
    private int life_of_building;

    public House() {
        this.id = 0;
        this.life_of_building = 0;
        this.type_of_building = "";
        this.street = "";
        this.number_of_rooms = 0;
        this.area = 0;
        this.floor = 0;
        this.number_of_apartment = 0;
    }

    public House(int id, int number_of_apartment, int area, int floor, int number_of_rooms, String street, String type_of_building, int life_of_building) {
        this.id = id;
        this.number_of_apartment = number_of_apartment;
        this.area = area;
        this.floor = floor;
        this.number_of_rooms = number_of_rooms;
        this.street = street;
        this.type_of_building = type_of_building;
        this.life_of_building = life_of_building;
    }

    public void input() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter id: ");
        this.id = console.nextInt();
        System.out.print("Enter number of rooms: ");
        this.number_of_rooms = console.nextInt();
        System.out.print("Enter area: ");
        this.area = console.nextInt();
        System.out.print("Enter floor: ");
        this.floor = console.nextInt();
    }

    public void show() {
        System.out.println(toString());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber_of_apartment() {
        return number_of_apartment;
    }

    public void setNumber_of_apartment(int number_of_apartment) {
        if (number_of_apartment > 0) {
            this.number_of_apartment = number_of_apartment;
        } else System.out.println("The apartment number cannot be negative or zero!");
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        if (area > 0) {
            this.area = area;
        } else System.out.println("The area cannot be negative or zero!");
    }

    public int getNumber_of_rooms() {
        return number_of_rooms;
    }

    public void setNumber_of_rooms(int number_of_rooms) {
        if (number_of_rooms > 0) {
            this.number_of_rooms = number_of_rooms;
        } else System.out.println("The number of rooms cannot be negative or zero!");
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getType_of_building() {
        return type_of_building;
    }

    public void setType_of_building(String type_of_building) {
        this.type_of_building = type_of_building;
    }

    public int getLife_of_building() {
        return life_of_building;
    }

    public void setLife_of_building(int life_of_building) {
        if (life_of_building > 0) {
            this.life_of_building = life_of_building;
        } else System.out.println("The life of building cannot be negative or zero!");
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        if (floor > 0) {
            this.floor = floor;
        } else System.out.println("The floor cannot be negative or zero!");
    }

    @Override
    public String toString() {
        return "House --- " +
                "id: " + id +
                ", Number of rooms: " + number_of_rooms +
                ", Area: " + area +
                ", Floor: " + floor;
    }
}
