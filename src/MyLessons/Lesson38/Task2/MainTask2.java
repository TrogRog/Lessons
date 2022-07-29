package MyLessons.Lesson38.Task2;


public class MainTask2 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        Thread thread3 = new Thread(myRunnable);
        thread1.setName("Первый");
        thread2.setName("Второй");
        thread3.setName("Третий");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

