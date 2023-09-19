package exam04;

public class Box<T extends Fruit & Eatable> { // Fruit, Apple, Melon ...
    private T item;
    //private static T item2;
    //private T[] item3 = new T[3];

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void printInfo() {
        System.out.println(item.getInfo());
    }
}
