package MyLessons.Lesson38.Task4;

public class Producer <T> implements Runnable {
    private MyQueue<T> myQueue;


    public Producer(MyQueue<T> myQueue) {
        this.myQueue = myQueue;
    }


    @Override
    public void run() {
        int i =0;
        while (true){
            myQueue.put((T) new Obj(i++));
        }
    }
}
