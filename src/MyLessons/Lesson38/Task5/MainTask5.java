package MyLessons.Lesson38.Task5;


public class MainTask5 {
    public static void main(String[] args) {
        Fork[] forks = {new Fork(), new Fork(), new Fork(), new Fork(), new Fork()};

        Philosoph philosoph1 = new Philosoph(forks[0], forks[1]);
        Philosoph philosoph2 = new Philosoph(forks[1], forks[2]);
        Philosoph philosoph3 = new Philosoph(forks[2], forks[3]);
        Philosoph philosoph4 = new Philosoph(forks[3], forks[4]);
        Philosoph philosoph5 = new Philosoph(forks[4], forks[0]);

        Thread thread1 = new Thread(philosoph1);
        thread1.setName("Philosoph 1");
        Thread thread2 = new Thread(philosoph2);
        thread2.setName("Philosoph 2");
        Thread thread3 = new Thread(philosoph3);
        thread3.setName("Philosoph 3");
        Thread thread4 = new Thread(philosoph4);
        thread4.setName("Philosoph 4");
        Thread thread5 = new Thread(philosoph5);
        thread5.setName("Philosoph 5");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }
}

