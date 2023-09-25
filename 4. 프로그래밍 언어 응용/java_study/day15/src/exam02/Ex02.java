package exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Ex02 {
    public static void main(String[] args) {
        List<String> strs = null;
        Optional<List<String>> opt = Optional.ofNullable(strs);

       // List<String> strs2 = opt.orElseGet(() -> new ArrayList<>());
        List<String> strs2 = opt.orElseGet(ArrayList::new);
        System.out.println(strs2);
    }
}
