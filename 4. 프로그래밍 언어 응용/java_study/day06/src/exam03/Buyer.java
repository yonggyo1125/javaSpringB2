package exam03;

public interface Buyer {
    void buy();

    default void order() { // public
        System.out.println("Buyer 주문!");
        privateMethod();
    }

    public static void staticMethod() {
        System.out.println("정적 메서드!");
    }

    private void privateMethod() {

        System.out.println("Private 메서드!");
    }
}
