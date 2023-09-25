package exam02;

import java.util.Optional;

public class Ex01 {
    public static void main(String[] args) {
        // String str = "가나다";
        String str = null;
        //Optional<String> opt = Optional.of(str);
       // String str2 = opt.get();
       // System.out.println(str2);

        Optional<String> opt = Optional.ofNullable(str);
       // String str2 = opt.get();
        String str2 = opt.orElse("기본값!");
        System.out.println(str2);
    }
}
