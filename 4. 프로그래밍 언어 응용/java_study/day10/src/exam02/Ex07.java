package exam02;

import java.util.Objects;

public class Ex07 {
    public static void main(String[] args) {
        String str = null;
        str = Objects.requireNonNullElse(str, "abc");
        System.out.println(str.toUpperCase());
    }
}
