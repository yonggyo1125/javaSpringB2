package exam02;

public class Outer3 {
    Calculator method(int num3) {

        return new Calculator() {
            public int add(int num1, int num2) {
                return num1 + num2 + num3;
            }
        };

    }
    /*
    void method(int num1) {
        class Inner {
            void method() {

                System.out.println("지역 내부 클래스! : " + num1);
            }
        }

        Inner in = new Inner();
        in.method();
    }
     */
}
