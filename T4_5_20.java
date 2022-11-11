package mypack_t_5_20;

public class T4_5_20 {
    public static void main(String[] args) {

        String days = "11/11/2022,Friday 10/10/2022,Monday 06/01/2022,Thursday 22/07/2020,Wednesday";

        Year year = new Year(days);
        String new_day = "10/11/2022,Thursday";
        String[] values = new_day.split(",");
        year.addDay(new Day(values[1], values[0]));
        year.printDayOfWeek("22/07/2020");
        System.out.printf("%d days\n", year.countDays("01/01/2022", "12/11/2022"));
        System.out.printf("%d months", year.countMonths("09/10/2022", "15/12/2022"));
    }
}
