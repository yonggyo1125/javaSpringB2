package exam01;

public class Ex08 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        System.out.println(num1 == num2);
        String str = new String("abc");
        String str2 = new String("abc");
        System.out.println(str == str2);
        System.out.println(str.equals(str2));
    }
}
