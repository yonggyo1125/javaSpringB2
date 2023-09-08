package exam02;

public class Ex04 {
    public static void main(String[] args) {
        Schedule2 s1 = new Schedule2(2023, 9, 8);

        System.out.println("s1 : " + s1); // s1.toString()
        System.out.println("s1 주소 : " + System.identityHashCode(s1));

        s1.printThis();
    }
}
