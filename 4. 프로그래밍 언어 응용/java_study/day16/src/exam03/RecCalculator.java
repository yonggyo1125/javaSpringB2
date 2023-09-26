package exam03;

public class RecCalculator implements Calculator {
    @Override
    public long factorial(long num) {
        long stime = System.currentTimeMillis();
        try {
            if (num < 1)
                return 1;

            return num * factorial(num - 1);
        } finally {
            long etime = System.currentTimeMillis();
            System.out.printf("걸린 시간 : %d%n", etime - stime);
        }
    }
}
