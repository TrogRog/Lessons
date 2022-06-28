package MyLessons.Lesson26.Task5;

public interface Cookable {


    public default void cook(String str) {
        System.out.println("Cook: " + str);
    }
}
