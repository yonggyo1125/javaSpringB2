package exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ex03 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("책1", "저자1", "출판사1"));
        books.add(new Book("책2", "저자2", "출판사2"));
        books.add(new Book("책2", "저자2", "출판사2"));
        books.add(new Book("책3", "저자3", "출판사3"));
        books.add(new Book("책4", "저자4", "출판사4"));
        books.add(new Book("책5", "저자5", "출판사5"));

        ListIterator<Book> iter = books.listIterator();

        while(iter.hasNext()) {
            int num = iter.nextIndex();
            Book book = iter.next();

            System.out.printf("index : %d, %s%n", num, book);
        }

        while(iter.hasPrevious()) {
            int num = iter.previousIndex();
            Book book = iter.previous();

            System.out.printf("index : %d, %s%n", num, book);
        }
    }
}
