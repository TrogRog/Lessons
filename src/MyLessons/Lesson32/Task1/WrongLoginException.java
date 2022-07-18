package MyLessons.Lesson32.Task1;

public class WrongLoginException extends Exception {
    private String detail;

    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "WrongLoginException: " + detail;
    }
}
