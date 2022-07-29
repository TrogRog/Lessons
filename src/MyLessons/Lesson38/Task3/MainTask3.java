package MyLessons.Lesson38.Task3;

public class MainTask3 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('a');

        NewTread thread1 = new NewTread(stringBuilder);
        NewTread thread2 = new NewTread(stringBuilder);
        NewTread thread3 = new NewTread(stringBuilder);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
