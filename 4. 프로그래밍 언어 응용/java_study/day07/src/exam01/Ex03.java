package exam01;

public class Ex03 {
    public static void main(String[] args) {
        A a = new A() {
            public void method() {
                System.out.println("(수정)메서드!");
            }
        };

        a.method();
    }
}
