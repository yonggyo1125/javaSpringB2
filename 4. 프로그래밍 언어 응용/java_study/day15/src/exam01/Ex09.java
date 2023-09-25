package exam01;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex09 {
    public static void main(String[] args) {
        IntStream stm1 = IntStream.of(1, 2, 3, 4, 5);
        IntStream stm2 = IntStream.of(6,7,8,9,10);
        Stream<IntStream> stm3 = Stream.of(stm1, stm2);

        //stm3.map(s -> s.toArray()).forEach(s -> System.out.println(Arrays.toString(s)));

        int[] nums = stm3.flatMapToInt(s -> s).toArray();
        System.out.println(Arrays.toString(nums));
    }
}
