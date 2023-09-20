package exam05;

import java.util.List;

public class Juicier {

    public static void make(Basket<? extends Fruit> basket) {
        List<?> items = basket.getItems();
        System.out.println(items);
    }

    public static <T extends Fruit> void make3(Basket<T> basket) {
        List<T> items = basket.getItems();
        System.out.println(items);
    }

    public static void make2(Basket<? super Apple> basket) { // Apple, Fruit, Object
        List<?> items = basket.getItems();
        System.out.println(items);
    }

}
