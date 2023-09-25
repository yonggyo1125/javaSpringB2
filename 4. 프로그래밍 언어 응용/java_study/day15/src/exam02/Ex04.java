package exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex04 {
    public static void main(String[] args) {
        int[] nums = IntStream.iterate(0, x -> x + 2).limit(10).toArray();

        nums[0] = 1;
        boolean result = Arrays.stream(nums).allMatch(x -> x % 2 == 0);
        System.out.println(result);

        boolean result2 = Arrays.stream(nums).anyMatch(x -> x % 2 == 0);
        System.out.println(result2);

        int num = Arrays.stream(nums).filter(x -> x % 2 == 0).findFirst().getAsInt();
        System.out.println(num);
    }
}
