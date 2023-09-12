package exam07;

public class Outer {
    int num1 = 30;
    int num2 = 20;
    static int num;

    class Inner {
        int num1 = 10;
        static int num;

        void method() {
            System.out.println("Inner.num1 : " + num1);
            System.out.println("num2 : " + num2);
            System.out.println("Outer.num1 : " + Outer.this.num1);

        }
        static void staticMethod() {
            System.out.println("정적 메서드!");
        }
    }
}
