package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Calculator cal = (a, b) -> a + b;
        calc(cal);
        calc((a,b) -> a + b);
        calc(new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        });
        //int result = cal.add(10,20);
        //System.out.println(result);
    }

    public static void calc(Calculator cal) {
        int result = cal.add(10, 20);
        System.out.println(result);
    }
}
