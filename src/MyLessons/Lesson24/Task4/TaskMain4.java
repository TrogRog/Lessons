package MyLessons.Lesson24.Task4;

public class TaskMain4 {
    public static void main(String[] args) {
        System.out.println(returnMiddle("string"));
        System.out.println(returnMiddle("code"));
        System.out.println(returnMiddle("Practice"));
    }

    static String returnMiddle(String str) {
        int start = str.length() / 2 - 1;
        int end = str.length() / 2 + 1;

        return str.substring(start, end);
    }
}
