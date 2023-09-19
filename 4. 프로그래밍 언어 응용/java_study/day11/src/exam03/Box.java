package exam03;

public class Box<T extends Fruit> {
    private T item;
    //private static T item2;
    //private T[] item3 = new T[];

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void printInfo() {
        //item.getInfo();
    }
}
