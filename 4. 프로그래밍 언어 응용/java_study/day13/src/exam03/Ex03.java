package exam03;

import java.util.stream.IntStream;

public class Ex03 {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 10).map(x -> x * x).filter(x -> x % 2 == 1).sum();
        System.out.println(sum);
    }
}
