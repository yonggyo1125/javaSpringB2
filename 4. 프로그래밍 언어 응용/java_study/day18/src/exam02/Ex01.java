package exam02;

import java.util.Calendar;
import static java.util.Calendar.*;

public class Ex01 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
    }

    public static void printDate(Calendar cal) {
        String dateStr = String.format("%d-%d-%d", cal.get(YEAR), cal.get(MONTH), cal.get(DAY_OF_MONTH));

        System.out.println(dateStr);

    }
}
