package exam01;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        int total1 = add(10, 20, 30, 40);
        int total2 = add(10, 20, 30);
        System.out.printf("total1=%d,total2=%d%n", total1, total2);
    }

    public static int add(int... nums) {

        int total = 0;
        for (int num : nums) {
            total += num;
        }

        return total;
    }
}
