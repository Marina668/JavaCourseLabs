import java.util.Scanner;

public class T3_1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int min_len = arr[0].length();
        for (int i = 1; i < arr.length; i++){
            if(arr[i].length() < min_len){
                min_len = arr[i].length();
            }
        }
        System.out.println("Number(s) with minimum number of digits: ");
        for (String el: arr)
            if (el.length() == min_len)
                System.out.println(el);
    }
}
