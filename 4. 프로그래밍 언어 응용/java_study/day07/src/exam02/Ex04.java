package exam02;

import java.util.function.IntBinaryOperator;

public class Ex04 {
    public static void main(String[] args) {
        /*
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        }; */
        IntBinaryOperator cal = new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left + right;
            }
        };

        int result = cal.applyAsInt(10, 20);
        System.out.println(result);
    }
}
