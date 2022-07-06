package MyLessons.Lesson30.Task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskMain5 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Петров", "ММ-202", 2, 3.9));
        students.add(new Student("Сидоров", "ММ-202", 2, 2.7));
        students.add(new Student("Иванов", "РP-101", 1, 3.2));
        students.add(new Student("Углев", "РP-101", 1, 4.5));
        students.add(new Student("Сундуков", "КК-401", 4, 4.3));

        printStudents(students,1);
        printStudents(students, 2);
        printStudents(students,3);
        printStudents(students,4);
        System.out.println("---------------------");
        expelOrNext(students);
        printStudents(students, 2);
        printStudents(students,3);
        printStudents(students,4);
        printStudents(students,5);

    }

    static void printStudents(List<Student> students, int course) {
        System.out.println("На " + course + " обучаются:");
        for (Student student : students) {
            if (student.course == course) {
                System.out.println(student.name);
            }
        }
    }

    static void expelOrNext(List<Student> students) {
        Iterator<Student> st = students.iterator();
        while (st.hasNext()) {
            Student student = st.next();
            if (student.avrGrade < 3) {
                st.remove();
            } else {
                student.course++;
            }
        }
    }
}