package exam01;

import java.util.function.IntBinaryOperator;

public class Ex05 {
    public static void main(String[] args) {
        IntBinaryOperator cal = (a, b) -> a + b;
        int result = cal.applyAsInt(10, 20);
        System.out.println(result);
    }
}
