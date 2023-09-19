package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Box appleBox = new Box();
        appleBox.setItem(new Apple()); // Object item = new Apple();
      // Apple apple = (Apple)appleBox.getItem();


        Box melonBox = new Box();
        melonBox.setItem(new Melon()); // Object item = new Melon();
        Object obj = melonBox.getItem();
        if (obj instanceof Apple) {
            Apple melon = (Apple) obj;
        }
    }
}
