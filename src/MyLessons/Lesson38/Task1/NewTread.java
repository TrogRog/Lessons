package MyLessons.Lesson38.Task1;

public class NewTread extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("V");
        }
    }
}
