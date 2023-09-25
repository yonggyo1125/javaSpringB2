package exam01;

import java.util.stream.IntStream;

public class Ex05 {
    public static void main(String[] args) {
        //IntStream.range(0, 10).forEach(i -> System.out.println(++i + "번 반복"));

        int sum = IntStream.rangeClosed(1, 100).filter(x -> x % 2 == 0).sum();
        System.out.println(sum);
    }
}
