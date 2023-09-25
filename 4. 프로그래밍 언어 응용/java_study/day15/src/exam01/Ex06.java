package exam01;

import java.util.Random;

public class Ex06 {
    public static void main(String[] args) {
        (new Random()).ints(10)
                       // .limit(10)
                        .sorted()
                        .forEach(System.out::println);
    }
}
