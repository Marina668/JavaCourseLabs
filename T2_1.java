import mypack_t_2_1.*;

import java.util.*;


public class T2_1 {

    // a)
    static void printFaculty(Student[] st, String faculty) {
        System.out.printf("Students from %s faculty:\n", faculty);
        for (Student s : st) {
            if (Objects.equals(s.getFaculty(), faculty)) {
                s.show();
            }
        }
    }

    // b)
    static void getStudentsFacultyCourse(Student[] st, String faculty, int course) {
        System.out.printf("Students from %s faculty and %d course:\n", faculty, course);
        for (Student s : st) {
            if (Objects.equals(s.getFaculty(), faculty) && s.getCourse() == course) {
                s.show();
            }
        }
    }

    // c)
    static void getYear(Student[] st, String birthDate) {
        System.out.printf("Students with birth date %s:\n", birthDate);
        for (Student s : st) {
            if (Objects.equals(s.getBirthDate(), birthDate)) {
                s.show();
            }
        }
    }


    public static void main(String[] args) {
        int N = 3;
        Student[] arr = new Student[N];

        for (int i = 0; i < N; i++) {
            arr[i] = new Student();
            arr[i].input();
            System.out.println();
        }

        System.out.println();
        printFaculty(arr, "mechmat");
        getStudentsFacultyCourse(arr, "mechmat", 3);
        getYear(arr, "27/09/2002");
    }
}
