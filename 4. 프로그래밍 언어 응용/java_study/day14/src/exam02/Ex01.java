package exam02;

import java.util.Arrays;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        Integer[] nums1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        List<Integer> nums2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int result1 = Arrays.stream(nums1).mapToInt(x -> x * x).filter(x -> x % 2 == 1).sum();

        int result2 = nums2.stream().mapToInt(x -> x * x).filter(x -> x % 2 == 1).sum();

        System.out.printf("result1=%d, result2=%d%n", result1, result2);
    }
}
