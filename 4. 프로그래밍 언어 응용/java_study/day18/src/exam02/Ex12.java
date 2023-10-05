package exam02;

import java.time.Instant;

public class Ex12 {
    public static void main(String[] args) {
        Instant date1 = Instant.now();
        long time = date1.getEpochSecond(); // timestamp
        System.out.println(time);

        long time2 = date1.toEpochMilli(); // System.currentTimeMillis()
        System.out.println(time2);
    }
}
