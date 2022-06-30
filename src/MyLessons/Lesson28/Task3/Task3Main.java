package MyLessons.Lesson28.Task3;

import java.util.function.Predicate;

public class Task3Main {
    public static void main(String[] args) {

        Predicate<String> predicate1 = s -> !s.isEmpty();

        System.out.println(predicate1.test(""));
        System.out.println(predicate1.test("string"));
    }
}
