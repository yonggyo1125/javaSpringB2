package exam02;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        //int[] nums = { 10, 20, 30, 40 };
        int[][] nums = { {10,20,30,40}, {50, 60, 70, 80}};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.deepToString(nums));
    }
}
