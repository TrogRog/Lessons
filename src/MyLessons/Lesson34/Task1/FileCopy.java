package MyLessons.Lesson34.Task1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {

        try (FileInputStream fileIn = new FileInputStream("D:\\src\\io\\file.txt");
             FileOutputStream fileOut = new FileOutputStream("D:\\src\\io\\copied_file.txt");
        )
        {
            int a;
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
            }
        } catch (IOException e) {
            System.out.print("Exception " + e);
        }
    }
}
