package mypack_t_5_20;

import java.util.ArrayList;
import java.util.List;

public class Month {
    private List<Day> days;

    public Month() {
        days = new ArrayList<>();
    }

    public Month(List<Day> days) {
        this.days = days;
    }

    public List<Day> getDays() {
        return days;
    }

    public void setDays(List<Day> days) {
        this.days = days;
    }

    public void addDay(Day day) {
        days.add(day);
    }

    public Day getDay(int index) {
        return days.get(index);
    }

    public void removeDay(Day day) {
        days.remove(day);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((days == null) ? 0 : days.hashCode());
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
        Month other = (Month) obj;
        if (days == null) {
            if (other.days != null)
                return false;
        } else if (!days.equals(other.days))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[days=" + days + "]";
    }
}
