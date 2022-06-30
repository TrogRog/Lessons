package MyLessons.Lesson28.Task8;

import java.util.function.Supplier;

public class TaskMain8 {
    public static void main(String[] args) {
        Supplier<Integer> supplier1 = () -> (int) (Math.random() * 10);
        System.out.println(supplier1.get());
    }
}
