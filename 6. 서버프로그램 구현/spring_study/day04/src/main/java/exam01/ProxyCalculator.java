package exam01;

public class ProxyCalculator implements Calculator {

    private Calculator calculator;

    public ProxyCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public long factorial(long num) {

        long result = calculator.factorial(num);

        return result;
    }
}
