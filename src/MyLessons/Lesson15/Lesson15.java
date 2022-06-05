package MyLessons.Lesson15;

import java.util.Arrays;

public class Lesson15 {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        Phone phone1 = new Phone("8111111", "Samsung", 11.1);
        Phone phone2 = new Phone("8222222", "Nokia", 22.2);
        Phone phone3 = new Phone("8333333", "Apple", 33.3);

        System.out.println("----Первый телефон----");
        phone1.print();
        System.out.println("----Второй телефон----");
        phone2.print();
        System.out.println("----Третий телефон----");
        phone3.print();
        System.out.println("----------------------");

        phone1.receiveCall("Max");
        phone1.getNumber();
        phone2.receiveCall("Stiv");
        phone2.getNumber();
        phone3.receiveCall("Denis", "123321");
        phone3.getNumber();
        System.out.println("----------------------");

        phone1.sendMessage("844444", "855555", "866666");
        System.out.println("----------------------");

        //Задание 2
        System.out.println("Задание 2");
        Person person1 = new Person("Max", 30);
        Person person2 = new Person();
        person1.print();
        person2.print();
        System.out.println();

        //Задание 3
        System.out.println("Задание 3");
        Matrix matrix1 = new Matrix(new double[][]{{1, 2}, {3, 4}});
        Matrix matrix2 = new Matrix(new double[][]{{5, 6}, {7, 8}});
        System.out.println("-------Матрица 1--------");
        matrix1.print();
        System.out.println("-------Матрица 2--------");
        matrix2.print();
        System.out.println("Сумма матриц 1 и 2:");
        Matrix.summMatrix(matrix1, matrix2).print();
        System.out.println("Умножение Матрицы 1 на число  3");
        Matrix.multyMatrix(matrix1, 3).print();
        System.out.println("Умножение Матрицы 1 на Матрицу 2");
        Matrix.multyMatrix(matrix1, matrix2).print();

        System.out.println("------------------------");
        //Задание 4
        System.out.println("Задание 4");
        Reader reader1 = new Reader(
                "Петров В. В",
                123456,
                "АСУ",
                "12.10.1980",
                "8111111"
        );
        Reader[] readerArray = new Reader[]{reader1};

        reader1.takeBook(3);
        reader1.takeBook("Приключения", "Словарь", "Энциклопедия");
        Book book1 = new Book("Пространство", "Петренко");
        Book book2 = new Book("Теория струн", "Шелдон");
        Book book3 = new Book("Теория чувств", "Иванов");
        reader1.takeBook(book1, book2, book3);
        reader1.returnBook("Приключения", "Словарь", "Энциклопедия");
        reader1.returnBook(book1, book2, book3);
    }
}
