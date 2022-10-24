package mypack_t_2_1;
import java.util.*;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String middlename;
    private String birthDate;
    private String address;
    private String phoneNumber;
    private String faculty;
    private int course;
    private String group;

    public Student() {}

    public Student(int id, String surname, String name, String middlename, String birthDate, String address, String phoneNumber,
                   String faculty, int course, String group){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middlename = middlename;
        this.birthDate = birthDate;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public void input() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter id: ");
        this.id = console.nextInt();
        System.out.print("Enter name: ");
        this.name = console.next();
        System.out.print("Enter course: ");
        this.course = console.nextInt();
        System.out.print("Enter faculty: ");
        this.faculty = console.next();
        System.out.print("Enter date of birth: ");
        this.birthDate = console.next();
    }

    public String toString() {
        return String.format("Student:\nname - %s\ncourse - %d\nfaculty - %s\ndate of birth - %s\n", this.name, this.course, this.faculty, this.birthDate);
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String fac) {
        this.faculty = fac;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getYear(){
        String[] birth = birthDate.split("\\.");
        return Integer.parseInt(birth[2]);
    }



}