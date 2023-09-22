package exam02;

import java.util.Arrays;
import java.util.function.Function;

public class Ex03 {
    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "melon", "mango"};
        String[] converted = map(fruits, s -> s.replace("a", "A"));
        System.out.println(Arrays.toString(converted));
    }

    public static String[] map(String[] items, Function<String,String> func) {
        String[] datas = new String[items.length];

        for (int i = 0; i < items.length; i++) {
            datas[i] = func.apply(items[i]);
        }

        return datas;
    }
}
