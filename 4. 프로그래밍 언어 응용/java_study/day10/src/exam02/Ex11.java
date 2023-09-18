package exam02;

import java.util.StringTokenizer;

public class Ex11 {
    public static void main(String[] args) {
        String str = "Apple,Orange#Melon+Banana";

        StringTokenizer st = new StringTokenizer(str, ",#+");
        while(st.hasMoreTokens()) {
            String fruit = st.nextToken();
            System.out.println(fruit);
        }
    }
}
