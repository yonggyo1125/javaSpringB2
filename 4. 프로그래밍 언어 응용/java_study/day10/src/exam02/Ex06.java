package exam02;

public class Ex06 {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf(10);
        System.out.println(i1 == i2);
        System.out.println("i1 주소 : " + System.identityHashCode(i1));
        System.out.println("i2 주소 : " + System.identityHashCode(i2));
    }
}
