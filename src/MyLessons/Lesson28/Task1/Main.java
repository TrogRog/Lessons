package MyLessons.Lesson28.Task1;


public class Main {
    public static void main(String[] args) {

        Printable card = () -> System.out.println("Печать Card");
        card.print();
    }
}
