package MyLessons.Lesson26.Task9;

public class Calculator {

    public static <T extends Number, V extends Number> double sum(T a, V b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T a, V b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, V extends Number> double subtraction(T a, V b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T a, V b) {
        return a.doubleValue() / b.doubleValue();
    }

    public static void main(String[] args) {

        System.out.println("Сумма = " + Calculator.sum(45.2, 12));
        System.out.println("Умножение = " + Calculator.multiply(12f, 12));
        System.out.println("Вычетание = " + Calculator.subtraction((long) 17, (short) 15));
        System.out.println("Деление = " + Calculator.divide((short) 25, 6));

    }
}
