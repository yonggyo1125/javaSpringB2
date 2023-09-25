package exam01;

import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {
        String[] chars = { "A", "AA", "BB", "AA", "CC", "DD", "AAA" };
        Arrays.stream(chars).distinct()
                    .peek(System.out::println)
                    .skip(4)
                    .forEach(System.out::println);
    }
}
