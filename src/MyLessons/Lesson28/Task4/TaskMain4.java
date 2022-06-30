package MyLessons.Lesson28.Task4;

import java.util.function.Predicate;

public class TaskMain4 {
    public static void main(String[] args) {
        Predicate<String> predicate1 = s -> s != null;
        Predicate<String> predicate2 = s -> !s.isEmpty();
        Predicate<String> predicate3 = predicate1.and(predicate2);
        Predicate<String> predicate = s -> s != null && !s.isEmpty();

        System.out.println(predicate3.test(""));
        System.out.println(predicate3.test(null));
        System.out.println(predicate3.test("string"));
        System.out.println(predicate1.and(predicate2).test("string"));
        System.out.println(predicate.test("string"));
    }
}
