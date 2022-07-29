package MyLessons.Lesson38.Task4;

import java.util.LinkedList;
import java.util.Queue;

public class MainTask4 {
    public static void main(String[] args) {
        Queue<Obj> queue= new LinkedList<>();
        MyQueue<Obj> myQueue = new MyQueue<>(queue);

        Consumer<Obj>consumer = new Consumer(myQueue);
        Consumer<Obj> consumer1 = new Consumer(myQueue);
        Producer<Obj> producer = new Producer(myQueue);

        Thread t1 = new Thread(producer);
        t1.setName("Producer");
        Thread t2 = new Thread(consumer);
        t2.setName("Consumer №1");
        Thread t3 = new Thread(consumer1);
        t3.setName("Consumer №2");

        t1.start();
        t2.start();
        t3.start();
    }
}