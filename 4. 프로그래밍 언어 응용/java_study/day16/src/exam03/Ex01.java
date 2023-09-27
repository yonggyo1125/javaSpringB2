package exam03;

public class Ex01 {
    public static void main(String[] args) {
        long stime = System.nanoTime(); // 추가 기능

        ImplCacluator cal1 = new ImplCacluator();
        long result1 = cal1.factorial(10); // 핵심 기능
        System.out.println("cal1 : " + result1);

        long etime = System.nanoTime(); // 추가 기능
        System.out.printf("걸린 시간 : %d%n", etime - stime);


        stime = System.nanoTime();

        RecCalculator cal2 = new RecCalculator();
        long result2 = cal2.factorial(10); // 핵심 기능
        System.out.println("cal2 : " + result2);

        etime = System.nanoTime();
        System.out.printf("걸린 시간 : %d%n", etime - stime);
    }
}
