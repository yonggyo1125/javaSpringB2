package exam01;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex12 {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("책1");
        book.setAuthor("저자1");
        book.setPublisher("출판사1");

        Function<Book, String> func1 = Book::getTitle;
        System.out.println(func1.apply(book));

        Supplier<Book> func2 = Book::new; //() -> new Book();
    }
}
