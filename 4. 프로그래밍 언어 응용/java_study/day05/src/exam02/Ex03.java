package exam02;

public class Ex03 {
    public static void main(String[] args) {
        A ac = new C();
        A ad = new D();


        if (ad instanceof C) {
            C c1 = (C) ad; // 명시적 형변환
        }

        if (ac instanceof C) {
            C c2 = (C) ac;
            System.out.printf("numA=%d, numB=%d, numC=%d%n", c2.numA, c2.numB, c2.numC);
        }
    }
}
