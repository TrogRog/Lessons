package MyLessons.Lesson20.Task1;

public class PrintableMain {

    public static void main(String[] args) {
        Book book1 = new Book("Книга 1");
        Book book2 = new Book("Книга 2");
        Magazine magazine1 = new Magazine("Журнал 1");
        Magazine magazine2 = new Magazine("Журнал 2");

        Printable[] printables = {book1, book2, magazine1, magazine2};

        for (Printable printable : printables) {
            printable.print();
        }
        System.out.println("---------------");
        Magazine.printMagazines(printables);
        System.out.println("---------------");
        Book.printBooks(printables);
    }
}
