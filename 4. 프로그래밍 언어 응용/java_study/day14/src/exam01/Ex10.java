package exam01;

import java.util.function.Consumer;

public class Ex10 {
    public static void main(String[] args) {
        Consumer<String> func1 = System.out::println; // s -> System.out.println(s)
        func1.accept("가나다");
    }
}
