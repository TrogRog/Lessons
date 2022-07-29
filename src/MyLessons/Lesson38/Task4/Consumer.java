package MyLessons.Lesson38.Task4;

import java.util.Queue;

public class Consumer<T> implements Runnable {
    private MyQueue<T> myQueue;
    public Consumer(MyQueue<T> myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        while (true) {
            T t = myQueue.get();
        }
    }
}
