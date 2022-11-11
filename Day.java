package mypack_t_5_20;

public class Day {
    private String day_of_week;
    private String date;

    Day() {
        this.day_of_week = "";
        this.date = "";
    }

    Day(String day_of_week, String date) {
        this.day_of_week = day_of_week;
        this.date = date;
    }

    public String getDayOfWeek() {
        return day_of_week;
    }

    public String getDate() {
        return date;
    }

    public int getDay() {
        String[] values = date.split("/");
        return Integer.parseInt(values[0]);
    }

    public int getMonth() {
        String[] values = date.split("/");
        return Integer.parseInt(values[1]);
    }

    public int getYear() {
        String[] values = date.split("/");
        return Integer.parseInt(values[2]);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((day_of_week == null) ? 0 : day_of_week.hashCode());
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Day other = (Day) obj;
        if (day_of_week == null) {
            if (other.day_of_week != null)
                return false;
        } else if (!day_of_week.equals(other.day_of_week))
            return false;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", date, day_of_week);
    }
}
