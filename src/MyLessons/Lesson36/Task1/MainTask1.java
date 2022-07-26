package MyLessons.Lesson36.Task1;

import java.io.*;

public class MainTask1 {
    private static final String FILE_NAME = "C:\\horse.txt";

    public static void main(String[] args) {
        Horse horse1 = new Horse(10, "Ганноверская");
        serialize(horse1);
        Horse horseNew1 = deserialize();

        System.out.println(horse1.toString());
        System.out.println(horseNew1.toString());
    }


    private static void serialize(Horse horse) {
        Horse horseSer = new Horse(horse.getAge(), horse.getBreed());
        try (FileOutputStream fis = new FileOutputStream(FILE_NAME);
             ObjectOutputStream oos = new ObjectOutputStream(fis)
        ) {
            oos.writeObject(horseSer);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Horse deserialize() {
        Horse horse = null;
        try (FileInputStream fis = new FileInputStream(FILE_NAME);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            horse = (Horse) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return horse;
    }
}


