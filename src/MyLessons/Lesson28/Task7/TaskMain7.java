package MyLessons.Lesson28.Task7;

import java.util.function.Function;

public class TaskMain7 {
    public static void main(String[] args) {
        Function<Integer, String> function1 = x -> {
            String result = "Ноль";
            if (x > 0) {
                result = "Положительное число";
            } else if (x < 0) {
                result = "Отрицательное число";
            }
            return result;
        };

        System.out.println(function1.apply(-5));
        System.out.println(function1.apply(0));
        System.out.println(function1.apply(7));
    }
}
