package MyLessons.Lesson5;


public class Lesson5 {
    /*
    main программа
    */
    public static void main(String[] args) {
        boolean x1 = true;          // логический литерал
        String x2 = "Урок 4";       // строковый
        char x3 = 'u';              // символьный
        int x4 = 0b1101;            // целочисленный 2-й
        int x5 = 010;               // целочисленный 8-й
        int x6 = 978;               // целочисленный 10-й
        int x7 = 0x7ddddfff;        // целочисленный 16-й
        float x8 = 13.14f;          // литерал типа float
        double x9 = 6.1;            // литерал типа double
        //int x, y, summ, minus, umnozh, delenie;
        System.out.println(x1 + "\n" + x2 + "\n" + x3 + "\n" + x4 + "\n" + x5 + "\n" + x6 + "\n" + x7 + "\n" + x8 + "\n" + x9);
        System.out.println("Сумма = " + Algebra.sum(4,2));
        System.out.println("Вычетание = " + Algebra.subtract(4,2));
        System.out.println("Умножение = " + Algebra.multiply(4,2));
        System.out.println("Деление = " + Algebra.divide(4,2));

    }
}
