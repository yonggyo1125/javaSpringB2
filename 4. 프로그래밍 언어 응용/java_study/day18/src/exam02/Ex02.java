package exam02;

import java.time.LocalDate;

public class Ex02 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        LocalDate date2 = LocalDate.of(2022, 10, 4);
        System.out.println(date2);
    }
}
