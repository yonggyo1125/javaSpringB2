package exam01;

import java.util.function.BiFunction;

public class Ex03 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> cal = (a, b) -> a + b;
        int result = cal.apply(10, 20);
        System.out.println(result);
    }
}
