package exam02;

public class Ex04 {
    public static void main(String[] args) {
        A ac = new C();
        System.out.println(ac instanceof C);
        System.out.println(ac instanceof B);
        System.out.println(ac instanceof A);

        System.out.println(ac instanceof D);
    }
}
