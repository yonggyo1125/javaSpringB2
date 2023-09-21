package exam02;

import java.util.Arrays;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {
        char[] stars = new char[10];
        Arrays.fill(stars, '*');
        System.out.println(Arrays.toString(stars));

        int[] nums1 = {1,2,3,4,5,6,7,8,9};
        int[] nums2 = {1,2,3,5,6,7,8,9,10};
        int pos = Arrays.mismatch(nums1, nums2);
        System.out.println(pos);

        List<String> fruits = Arrays.asList("Apple", "Orange", "Melon");
        //fruits.remove(1);
        System.out.println(fruits);
    }
}
