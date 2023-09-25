package exam02;

import java.util.Optional;

public class Ex03 {
    public static void main(String[] args) {
        String str = null;
        Optional<String> opt = Optional.ofNullable(str);
        //String str2 = opt.orElseThrow(() -> new IllegalArgumentException());
        String str2 = opt.orElseThrow(IllegalArgumentException::new);
    }
}
