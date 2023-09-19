package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.setItem(new Apple());
        //appleBox.setItem(new Melon());
        Apple apple = appleBox.getItem();


       //Box<Toy> toyBox = new Box<>();
    }
}
