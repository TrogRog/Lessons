package MyLessons.Lesson28.Task9;


import java.util.function.Consumer;

public class PrintableMain {

    public static void main(String[] args) {
        Book book1 = new Book("Книга 1");
        Book book2 = new Book("Книга 2");

        Printable[] printables = {book1, book2};

        for (Printable printable : printables) {
            Consumer<Printable> printableConsumer = System.out::println;
            printableConsumer.accept(printable);
        }
    }
}
