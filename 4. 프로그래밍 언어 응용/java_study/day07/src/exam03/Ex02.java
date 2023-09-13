package exam03;

public class Ex02 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 0;
            int num3 = num1 / num2; // ArithmethicException // throw new Arithmetic...
            System.out.println(num3);
        } catch (ArithmeticException e) {
            //String message = e.getMessage();
            //System.out.println(message);
            e.printStackTrace();
        }

        System.out.println("아주 중요한 소스 코드... 실행안되면 절대 안됨...");
    }
}
