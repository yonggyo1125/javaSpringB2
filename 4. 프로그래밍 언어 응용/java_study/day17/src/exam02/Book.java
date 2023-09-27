package exam02;

import java.io.Serializable;

public class Book implements Serializable {
    private static final long serialVersionUID = 100L;

    private String title;
    private transient String author;
    private String publisher;

    private int price;

    private void method() {}

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
