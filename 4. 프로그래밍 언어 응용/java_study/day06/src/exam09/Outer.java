package exam09;

public class Outer {

    int num1 = 10;
    static int num2 = 20;

    static class Inner {
        void method() {
            System.out.println("정적 내부 클래스!");
            System.out.println(num2);
            //System.out.println(Outer.this.num1);

            Outer out = new Outer();
            System.out.println(out.num1);
        }
    }
}
