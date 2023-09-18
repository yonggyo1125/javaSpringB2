package exam01;

public class Ex03 {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println(System.identityHashCode(str));

        str += "DEF";
        System.out.println(System.identityHashCode(str));

        str += "GHI";
        System.out.println(System.identityHashCode(str));

        System.out.println(str);
    }
}
