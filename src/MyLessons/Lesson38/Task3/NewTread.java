package MyLessons.Lesson38.Task3;

public class NewTread extends Thread {
    private StringBuilder stringBuilder;

    public NewTread(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    @Override
    public void run() {
        synchronized (stringBuilder) {
            for (int i = 0; i < 100; i++) {
                System.out.print(stringBuilder);
            }
            System.out.println();

            char number = stringBuilder.charAt(0);
            number++;
            stringBuilder.setCharAt(0, number);
        }
    }
}
