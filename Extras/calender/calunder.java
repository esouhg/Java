//basic program using calender class
//findDay returns day of the week for a given date
//commented out parts are random functions that can be used in the class calender
import java.util.*;
public class calunder {
    public static void main(String args[]){
        // Calendar c = Calendar.getInstance();
        // System.out.println(c.getTime());
        // System.out.println(c.getWeekYear());
        // System.out.println(c.getWeeksInWeekYear());
        // System.out.println(c.get(Calendar.MONTH));
        // System.out.println(c.get(Calendar.DATE));
        // System.out.println(c.get(Calendar.HOUR));
        // c.set(Calendar.MONTH, 10);
        // c.set(Calendar.DATE, 8);
        // c.set(Calendar.YEAR, 2021);
        // System.out.println(c.getTime());
        // System.out.println(c.get(Calendar.DAY_OF_MONTH));
        // System.out.println(c.get(Calendar.DAY_OF_WEEK));
        // System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        // System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.print(findDay(9, 07, 2022));
    }
    public static String findDay(int month, int day, int year) {
        String[] days = {"Sunday", "Monday", "Tuesday","Wednesday", "Thursday","Friday", "Saturday" };
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DATE, day);
        c.set(Calendar.YEAR, year);
        int dey = c.get(Calendar.DAY_OF_WEEK)-1;
        return days[dey];

    }
}
