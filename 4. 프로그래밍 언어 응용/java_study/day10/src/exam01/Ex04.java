package exam01;

public class Ex04 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(System.identityHashCode(sb));

        sb.append("ABC");
        System.out.println(System.identityHashCode(sb));

        sb.append("DEF");
        System.out.println(System.identityHashCode(sb));

        sb.append("GHI");
        System.out.println(System.identityHashCode(sb));

        String str = sb.toString();
        System.out.println(System.identityHashCode(str));
        System.out.println(str);
        System.out.println(str.equals("ABCDEFGHI"));
    }
}
