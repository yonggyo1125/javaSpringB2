package exam01;

import java.util.function.IntUnaryOperator;

public class Ex07 {
    public static void main(String[] args) {
        IntUnaryOperator calc1 = a -> a * a;
        IntUnaryOperator calc2 = a -> a * 2;
        IntUnaryOperator calc3 = a -> -a;
        IntUnaryOperator calc4 = calc1.andThen(calc2);
        IntUnaryOperator calc5 = calc4.andThen(calc3);

        System.out.println(calc4.applyAsInt(10));
        System.out.println(calc5.applyAsInt(10));

        /*
        int num1 = calc1.applyAsInt(10);
        System.out.println(num1);

        int num2 = calc2.applyAsInt(num1);
        System.out.println(num2);
        */
    }
}
