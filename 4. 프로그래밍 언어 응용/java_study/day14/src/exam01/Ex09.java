package exam01;

import java.util.function.IntPredicate;

public class Ex09 {
    public static void main(String[] args) {
        IntPredicate cond1 = a -> a >= 10;
        IntPredicate cond2 = a -> a <= 100;
        IntPredicate cond3 = cond1.and(cond2); // 10 <= a <= 100
        IntPredicate cond4 = cond3.negate(); // a < 10 and a > 100

        boolean result1 = cond1.test(200);
        boolean result2 = cond3.test(50);
        boolean result3 = cond4.test(200);

        System.out.printf("result1=%s, result2=%s, result3=%s%n", result1, result2, result3);
    }
}
