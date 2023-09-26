package exam03;

public class ImplCacluator implements Calculator {
    @Override
    public long factorial(long num) {
        long stime = System.currentTimeMillis();
        try {
            long total = 1L;
            for (long i = 1L; i <= num; i++) {
                total *= i;
            }

            return total;
        } finally {
            long etime = System.currentTimeMillis();
            System.out.printf("걸린 시간 : %d%n", etime - stime);
        }
    }
}
