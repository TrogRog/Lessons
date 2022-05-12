package MyLessons.Lesson7;

import java.sql.SQLOutput;

public class Lesson7 {
    public static void main(String[] args) {
        int r = 111100;
        Targets.overOdd(3);
        Targets.min(-1, 2, -4);
        Targets.blink(r, 3);
        Targets.run(r, 4);
        Targets.isFirstLampOn(r);
        Targets.info(r);

        for (String str : args) {
            System.out.println("аргумент = " + str);
        }
        System.out.println("Среднее значение арг. = " + (Double.parseDouble(args[0])
                + Double.parseDouble(args[1]) + Double.parseDouble(args[2])) / 3);
    }
}


