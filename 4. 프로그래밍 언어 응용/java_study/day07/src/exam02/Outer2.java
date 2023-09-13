package exam02;

public class Outer2 {

    int num1 = 10;
    static int num2 = 20;

    static class Inner {
        static int num2 = 30;
        void method() {
            //System.out.println(Outer2.this.num1);
            System.out.println(Outer2.num2);
        }
    }
}
