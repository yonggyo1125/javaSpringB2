package exam03;

public class Ex01 {
    public static void main(String[] args) {

        ImplCacluator cal1 = new ImplCacluator();
        long result1 = cal1.factorial(10);
        System.out.println("cal1 : " + result1);


        RecCalculator cal2 = new RecCalculator();
        long result2 = cal2.factorial(10);
        System.out.println("cal2 : " + result2);
    }
}
