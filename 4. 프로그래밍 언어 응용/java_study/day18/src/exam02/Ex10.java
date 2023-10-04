package exam02;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex10 {
    public static void main(String[] args) {
        ZonedDateTime kor = ZonedDateTime.now();
        ZonedDateTime rome = kor.withZoneSameInstant(ZoneId.of("Europe/Rome"));
        ZonedDateTime newYork = kor.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("ASIA/SEOUL : " + kor);
        System.out.println("Europe/Rome : " + rome);
        System.out.println("America/New_York : " + newYork);
    }
}
