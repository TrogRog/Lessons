package MyLessons.Lesson38.Task4;


import java.util.Queue;

public class MyQueue<T> {
    private Queue<T> queue;

    public MyQueue(Queue<T> queue) {
        this.queue = queue;
    }

    public synchronized T get() {
        while (queue.isEmpty()) {
            try {
                System.out.println(Thread.currentThread().getName() + " ожидает... ");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        T n = queue.poll();
        System.out.println(Thread.currentThread().getName() + " пoлyчил: " + n);
        notify();
        return n;
    }

    public synchronized void put(T n) {
        while (queue.size() >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        queue.offer(n);
        System.out.println(Thread.currentThread().getName() + " отпpaвил: " + n);
        notify();
    }


}
