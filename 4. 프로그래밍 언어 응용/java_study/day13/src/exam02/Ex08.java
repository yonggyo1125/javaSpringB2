package exam02;

import java.util.*;

public class Ex08 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(new Random().ints(5).boxed().toList());

        Collections.sort(nums, Comparator.reverseOrder());

        System.out.println(nums);
    }
}
