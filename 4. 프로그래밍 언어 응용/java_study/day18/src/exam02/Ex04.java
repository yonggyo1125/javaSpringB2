package exam02;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ex04 {
    public static void main(String[] args) {
       LocalDate date1 = LocalDate.now();
        DayOfWeek dayOfWeek = date1.getDayOfWeek();
        int yoil = dayOfWeek.getValue();
        System.out.println(yoil);

        String yoilStr1 = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
        String yoilStr2 = dayOfWeek.getDisplayName(TextStyle.NARROW, Locale.ENGLISH);
        String yoilStr3 = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        System.out.printf("SHORT=%s, NARROW=%s, FULL=%s%n", yoilStr1, yoilStr2, yoilStr3);
    }
}
