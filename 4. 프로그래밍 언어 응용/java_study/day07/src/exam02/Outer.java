package exam02;

public class Outer {
    int num1 = 20;
    class Inner {
        static int num = 10;
        int num1 = 30;
        void method() {
           System.out.println(num1);
           System.out.println(Outer.this.num1);
        }
        
        static void staticMethod() {
            System.out.println("정적 메서드");
        }
    }
}
