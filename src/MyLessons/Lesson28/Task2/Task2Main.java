package MyLessons.Lesson28.Task2;

import java.util.function.Predicate;

public class Task2Main {
    public static void main(String[] args) {

        Predicate<String> predicate1 = s -> s != null;

        System.out.println(predicate1.test(""));
        System.out.println(predicate1.test(null));
        System.out.println(predicate1.test("string"));

    }
}
