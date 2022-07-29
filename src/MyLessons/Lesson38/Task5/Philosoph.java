package MyLessons.Lesson38.Task5;

class Philosoph implements Runnable {
    private Fork fork1, fork2;

    public Philosoph(Fork fork1, Fork fork2) {
        this.fork1 = fork1;
        this.fork2 = fork2;
    }

    public void eat() {
        fork1.take();
        fork2.take();
        try {
            System.out.println(Thread.currentThread().getName() + ": ест");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void think() {
        fork1.drop();
        fork2.drop();
        try {
            System.out.println(Thread.currentThread().getName() + ": размышляет");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    @Override
    public void run() {
        while (true) {
            eat();
            think();
        }
    }
}
