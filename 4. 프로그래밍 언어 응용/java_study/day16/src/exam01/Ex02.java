package exam01;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Ex02 {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Orange", "Melon"}; // Apple,Orange,Melon

        String str = Arrays.stream(fruits).collect(Collectors.joining(","));
        System.out.println(str);

        String str2 = "";
        for (int i = 0; i < fruits.length; i++) {
            if (i > 0) str2 += ",";
            str2 += fruits[i];
        }
        System.out.println(str2);
    }
}
