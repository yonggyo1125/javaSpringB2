package exam03;

public class ImplCacluator implements Calculator {
    @Override
    public long factorial(long num) {
        long total = 1L;
        for (long i = 1L; i <= num; i++) {
            total *= i;
        }

        return total;
    }
}
