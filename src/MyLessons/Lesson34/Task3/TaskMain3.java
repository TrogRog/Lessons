package MyLessons.Lesson34.Task3;

import java.io.IOException;

public class TaskMain3 {
    public static void main(String[] args) {
        try {
            FileCopyClass.copyFile("C:\\src\\io\\file.txt", "C:\\src\\io\\copied_file.txt");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
