package MyLessons.Lesson34.Task2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {
    public static void main(String[] args) {

        try (FileOutputStream output = new FileOutputStream("D:\\src\\io\\a.txt");
             FileInputStream input = new FileInputStream("D:\\src\\io\\a.txt")
        ) {
            char[] symbols = {'a', 'b', 'c'};
            for (Character s : symbols) {
                output.write(s);
            }

            int size = input.available();

            for (int i = 0; i < size; i++) {
                System.out.print((char) input.read() + " ");
            }

        } catch (IOException e) {
            System.out.print("Exception" + e);
        }
    }
}