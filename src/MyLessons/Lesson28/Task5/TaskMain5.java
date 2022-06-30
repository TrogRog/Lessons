package MyLessons.Lesson28.Task5;

import java.util.function.Predicate;

public class TaskMain5 {
    public static void main(String[] args) {

        Predicate<String> predicate = s -> s.endsWith("A") && (s.startsWith("J") || s.startsWith("N"));

        System.out.println(predicate.test("Jemma"));
        System.out.println(predicate.test("JemmA"));
        System.out.println(predicate.test("NemmA"));
        System.out.println(predicate.test("nemmA"));
        System.out.println(predicate.test("New"));
    }
}
