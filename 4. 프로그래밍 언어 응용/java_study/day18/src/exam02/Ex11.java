package exam02;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class Ex11 {
    public static void main(String[] args) {
        LocalDateTime date1 = LocalDateTime.now();
        OffsetDateTime kor = date1.atOffset(ZoneOffset.of("+9"));
        OffsetDateTime rome = kor.withOffsetSameInstant(ZoneOffset.of("+2"));
        OffsetDateTime newYork = kor.withOffsetSameInstant(ZoneOffset.of("-4"));

        System.out.println(kor);
        System.out.println(rome);
        System.out.println(newYork);


    }
}
