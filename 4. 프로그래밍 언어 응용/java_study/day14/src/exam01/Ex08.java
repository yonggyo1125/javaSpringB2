package exam01;

import java.util.function.Function;

public class Ex08 {
    public static void main(String[] args) {
        //Function<String, String> func1 = s -> s; // 항등 함수
        Function<String, String> func1 = Function.identity();
        String str = func1.apply("A");
        System.out.println(str);
    }
}
