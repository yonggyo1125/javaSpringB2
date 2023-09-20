package exam05;

public class Ex01 {
    public static void main(String[] args) {
        Basket<Apple> appleBasket = new Basket<>();
        appleBasket.add(new Apple());
        appleBasket.add(new Apple());

        Juicier.make3(appleBasket);

        Basket<Melon> melonBasket = new Basket<>();
        melonBasket.add(new Melon());
        melonBasket.add(new Melon());

        Juicier.make3(melonBasket);

        Basket<Toy> toyBasket = new Basket<>();
        toyBasket.add(new Toy());
        toyBasket.add(new Toy());

        //Juicier.make(toyBasket);
    }
}
