package MyLessons.Lesson38.Task2;

public class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println(
                        Thread.currentThread().getName()
                                + "Поток "
                                + ": " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}