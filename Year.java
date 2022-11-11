package mypack_t_5_20;

import java.util.Arrays;
import java.util.Objects;

public class Year extends Day {
    private Day[] year;

    Year(String str) {
        String[] dates = str.split(" ");
        year = new Day[dates.length];
        for (int i = 0; i < dates.length; i++){
            String[] values = dates[i].split(",");
            year[i] = new Day(values[1], values[0]);
        }
    }

    void addDay(Day d) {
        int n = this.year.length;
        Day[] tmp = Arrays.copyOf(this.year, n);
        this.year = new Day[n + 1];
        System.arraycopy(tmp, 0, year, 0, n);
        year[n] = d;
    }


    public void printDayOfWeek (String date) {
        for (Day d: this.year){
            if (Objects.equals(d.getDate(), date))
                System.out.println(d.getDayOfWeek());
        }
    }

    public int countDays (String date1, String date2) {
        int count = 0;
        String[] d1 = date1.split("/");
        String[] d2 = date2.split("/");
        for (Day d: this.year){
            if (    (d.getYear() >= Integer.parseInt(d1[2]) && d.getYear() <= Integer.parseInt(d2[2])) &&
                    (d.getMonth() >= Integer.parseInt(d1[1]) && d.getMonth() <= Integer.parseInt(d2[1])) &&
                    (d.getDay() > Integer.parseInt(d1[0]) && d.getDay() < Integer.parseInt(d2[0])))
                count++;
        }
        return count;
    }

    public int countMonths (String date1, String date2) {
        int count = 0;
        String[] d1 = date1.split("/");
        String[] d2 = date2.split("/");
        for (Day d: this.year){
            if (    (d.getYear() >= Integer.parseInt(d1[2]) && d.getYear() <= Integer.parseInt(d2[2])) &&
                    (d.getMonth() > Integer.parseInt(d1[1]) && d.getMonth() < Integer.parseInt(d2[1])))
                count++;
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (Day day : this.year)
            str.append(day.toString());
        return str.toString();
    }

}
