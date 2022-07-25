package MyLessons.Lesson34.Task3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyClass {
    static void copyFile(String fromPath, String toPath) throws IOException {
        try (FileInputStream fileIn = new FileInputStream(fromPath);
             FileOutputStream fileOut = new FileOutputStream(toPath)) {
            int a;
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
            }
        }
    }
}