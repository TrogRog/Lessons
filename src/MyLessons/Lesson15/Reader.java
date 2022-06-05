package MyLessons.Lesson15;

public class Reader {
    private String userName;
    private int numberCard;
    private String faculty;
    private String dayHappy;
    private String phone;

    public Reader(String userName, int numberCard, String faculty, String dayHappy, String phone) {
        this.userName = userName;
        this.numberCard = numberCard;
        this.faculty = faculty;
        this.dayHappy = dayHappy;
        this.phone = phone;
    }

    void takeBook(int amountBooks) {
        System.out.println(userName + " взял " + amountBooks + " книги");
    }

    void takeBook(String... nameBook) {
        System.out.print(userName + " взял книги: ");
        for (String a : nameBook) {
            System.out.print(a + " | ");
        }
        System.out.println();
    }

    void takeBook(Book... book) {
        System.out.print(userName + " взял книги: ");
        for (Book a : book) {
            System.out.print(a.getBookName() + " | ");
        }
        System.out.println();
    }

    void returnBook(String... nameBook) {
        System.out.print(userName + " вернул книги: ");
        for (String a : nameBook) {
            System.out.print(a + " | ");
        }
        System.out.println();
    }

    void returnBook(Book... book) {
        System.out.print(userName + " вернул книги: ");
        for (Book a : book) {
            System.out.print(a.getBookName() + " | ");
        }
        System.out.println();
    }
}
