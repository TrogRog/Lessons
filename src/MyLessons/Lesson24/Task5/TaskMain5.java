package MyLessons.Lesson24.Task5;

import java.text.Format;
import java.util.Formatter;

public class TaskMain5 {
    public static void main(String[] args) {
        printStudent("Петров", 5, "Математика");
        printStudent("Сидорова", 4, "Физика");

    }

    private static void printStudent(String familyName, int mark, String subject) {
        Formatter formatter = new Formatter();
        formatter.format("Студент %15s получил %3s по %-10s.", familyName, mark, subject);
        System.out.println(formatter);
       // System.out.printf("Студент %15s получил %3s по %-10s.\n", familyName, mark, subject);
    }
}
