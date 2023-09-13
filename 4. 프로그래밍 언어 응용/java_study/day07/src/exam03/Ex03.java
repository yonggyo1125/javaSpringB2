package exam03;

public class Ex03 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 2;
            int num3 = num1 / num2;
            System.out.println(num3);

            String str = null;
            System.out.println(str.toUpperCase());
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("중요한 코드!");
    }
}
