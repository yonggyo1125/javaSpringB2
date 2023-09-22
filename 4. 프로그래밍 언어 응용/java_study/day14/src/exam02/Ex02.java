package exam02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex02 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> stm = nums.stream();

        IntStream stmt = stm.mapToInt(x -> x * x).filter(x -> x % 2 == 1); // 중간 연산

        int result = stmt.sum(); //  최종 연산

        // 중간 연산은 최종 연산이 호출 되기 전에는 연산 X - 지연된 연산
        System.out.println(result);


    }
}
