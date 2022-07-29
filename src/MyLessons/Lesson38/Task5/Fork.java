package MyLessons.Lesson38.Task5;

class Fork {
    boolean isFreeFork = true;

    public synchronized void take() {
        if (!isFreeFork)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        isFreeFork = false;
    }

    public synchronized void drop() {
        isFreeFork = true;
        notify();

    }
}
