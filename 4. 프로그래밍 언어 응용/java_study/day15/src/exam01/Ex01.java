package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex01 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(0, 1, 2, 3, 4, 5, 6,7,8,9, 10);

        Stream<Integer> stm = nums.stream().map(x -> x * x).filter(x -> x % 2 == 0);
        List<Integer> nums2 = stm.toList();
        System.out.println(nums2);
    }
}
