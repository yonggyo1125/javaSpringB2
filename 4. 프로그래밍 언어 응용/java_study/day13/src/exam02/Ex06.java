package exam02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex06 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "이름1", "이름2", "이름3", "이름1", "이름1");
        System.out.println(names);

        int cnt = Collections.frequency(names, "이름1");
        System.out.println(cnt);

        List<String> names2 = Arrays.asList("이름4", "이름5", "이름6", "이름3");
        boolean result = Collections.disjoint(names, names2);
        System.out.println(result);
    }
}
