package MyLessons.Lesson32.Task1;

public class WrongPasswordException extends Exception {
    private String detail;

    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "WrongPasswordException: " + detail;
    }
}
