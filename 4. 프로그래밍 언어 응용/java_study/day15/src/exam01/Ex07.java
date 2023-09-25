package exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex07 {
    public static void main(String[] args) {
       List<String> stars = Stream.generate(() -> "*").limit(10).toList();
       System.out.println(stars);

       int[] nums = IntStream.iterate(2, x -> x + 2).limit(10).toArray();
       System.out.println(Arrays.toString(nums));
    }
}
