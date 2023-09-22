package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Ex06 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "melon", "orange");
        fruits.replaceAll(String::toUpperCase);

        System.out.println(fruits);
    }
}
