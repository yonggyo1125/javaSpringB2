package exam01;

public class Ex02 {
    public static void main(String[] args) {
        int c = 30;
        Calculator cal = (a, b) -> {
           //c = 40;
           return  a + b + c;
        };

        int result = cal.add(10, 20);
        System.out.println(result);
    }
}
