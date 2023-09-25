package exam01;

import java.util.Arrays;

public class Q5 {

    public static void main(String[] args) {
        int result1 = exists(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"});
        System.out.println(result1);

        int result2 = exists(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"});
        System.out.println(result2);

        int result3 = exists(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"});
        System.out.println(result3);

    }

    public static int exists(String[] spell, String[] dic) {
        dic = Arrays.stream(dic).map(String::toUpperCase).toArray(String[]::new);
        for (String d: dic) {
            boolean match = true;
            //d = d.toLowerCase();
            for (String s : spell) {
                if (d.indexOf(s.toLowerCase()) == -1) {
                    match = false;
                }
            }

            if (match) return 1;
        }

        return 2;
    }
}
