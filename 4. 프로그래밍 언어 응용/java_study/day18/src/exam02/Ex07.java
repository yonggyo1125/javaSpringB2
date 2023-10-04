package exam02;

import java.time.LocalDate;

public class Ex07 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = date1.plusWeeks(1);
        System.out.println(date2.isAfter(date1));
        System.out.println(date2.compareTo(date1));
    }
}
