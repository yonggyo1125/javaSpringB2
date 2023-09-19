package exam04;

public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> box = new Box<>();
        box.setItem(new Apple());

        Apple apple = box.getItem();
    }
}
