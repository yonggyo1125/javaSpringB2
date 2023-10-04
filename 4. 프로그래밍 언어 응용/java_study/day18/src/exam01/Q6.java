package exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q6 {
    public static void main(String[] args) {
        String[] result1 = splitStr("banana");
        System.out.println(Arrays.toString(result1));

        String[] result2 = splitStr("abracadabra");
        System.out.println(Arrays.toString(result2));

        String[] result3 = splitStr("aaabbaccccabba");
        System.out.println(Arrays.toString(result3));
    }
    public static String[] splitStr(String str) {

        List<String> splitStrs = new ArrayList<>();
        while(str.length() > 0) {
            char ch = str.charAt(0);
            int cntCur = 1, cntOther = 0;

            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    cntCur++;
                } else {
                    cntOther++;
                }

                if (cntCur == cntOther) {
                    splitStrs.add(str.substring(0, i + 1));
                    str = str.substring(i+1);
                    break;
                }
            }

            if (cntCur != cntOther) {
                splitStrs.add(str);
                break;
            }
        }

        return splitStrs.stream().toArray(String[]::new);
    }
}
