package exam02;

public class Ex05 {
    public static void main(String[] args) {
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        System.out.println(i1 == i2);
        System.out.println("i1 주소 : " + System.identityHashCode(i1));
        System.out.println("i2 주소 : " + System.identityHashCode(i2));
    }
}
