package exam03;

import java.util.Random;

public class Ex06 {
    public static void main(String[] args) {
        int n = 6;
        int[] nums = new Random().ints(n).sorted().peek(System.out::println).toArray();
        if (n % 2 == 1) System.out.printf("중간값 : %d%n", nums[n / 2]);
        else System.out.printf("중간값 : %d, %d%n", nums[n/2 -1], nums[n/2]);

    }
}
