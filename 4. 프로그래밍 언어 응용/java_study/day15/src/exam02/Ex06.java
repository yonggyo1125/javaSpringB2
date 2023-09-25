package exam02;

import java.util.Arrays;

public class Ex06 {
    public static void main(String[] args) {
        int[] scores = { 50, 40, 70, 88, 100, 33};
        /*
        int max = Arrays.stream(scores).reduce(Integer.MIN_VALUE, (acc, i) -> {

            System.out.printf("acc=%d, i=%d%n", acc, i);

            if (acc > i)
                return acc;
            else
                return i;
        });
         */
        int max = Arrays.stream(scores).reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println(max);

        int min = Arrays.stream(scores).reduce(Integer.MAX_VALUE, (a, b) -> a > b ? b : a);
        System.out.println(min);

        int min2 = Arrays.stream(scores).reduce((a, b) -> a > b ? b:a).getAsInt();
        System.out.println(min2);
    }
}
