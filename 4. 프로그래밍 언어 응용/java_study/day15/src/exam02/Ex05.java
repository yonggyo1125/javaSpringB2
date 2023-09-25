package exam02;

import java.util.stream.IntStream;

public class Ex05 {
    public static void main(String[] args) {
        int total = IntStream.iterate(10, x -> x + 10).limit(10)
                        .reduce(0, (acc, i) -> {

                            System.out.printf("acc=%d, i=%d%n", acc, i);

                            acc += i;
                            return acc;
                        });
        System.out.println(total);
    }
}
