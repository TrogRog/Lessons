package MyLessons.Lesson26.Task4;

public class Main {
    public static void main(String[] args) {

        Printable card = new Printable() {
            @Override
            public void print() {
                System.out.println("Печать Card");
            }
        };
        card.print();

    }
}
