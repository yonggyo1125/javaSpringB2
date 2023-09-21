package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Book book = new Book(1000, "책1", "저자1", "출판사1");
        System.out.println(book);
        System.out.printf("id:%d, title:%s, author:%s, publisher:%s%n",
            book.id(),book.title(), book.author(), book.publisher());
    }
}
