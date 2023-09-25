package exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;


public class Ex08 {
    private static List<Book> books = new ArrayList<>();
    public static void main(String[] args) {

        IntStream.rangeClosed(1, 10).forEach(Ex08::add);

        Set<String> titles = books.stream().map(Book::getTitle)
                .collect(toSet());
        System.out.println(titles);

        /*
        Map<Integer, Book> books2 = books.stream()
                .collect(toMap(Book::getIsbn, b -> b));

        books2.entrySet()
                .stream().forEach(e -> System.out.println(e.getKey() + "," + e.getValue()));
        */
    }

    private static void add(int i) {
        books.add(new Book(i, "책" + i, "저자" + i, "출판사" + i));
        books.add(new Book(i + 10, "책" + i, "저자" + i, "출판사" + i));
    }
}
