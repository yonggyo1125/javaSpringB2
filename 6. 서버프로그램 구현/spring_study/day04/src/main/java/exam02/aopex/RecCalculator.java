package exam02.aopex;

public class RecCalculator implements Calculator {
    @Override
    public long factorial(long num) {
        if (num < 1) {
            return 1;
        }

        return num * factorial(num - 1);
    }
}
