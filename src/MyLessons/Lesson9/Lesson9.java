package MyLessons.Lesson9;

import org.w3c.dom.ls.LSOutput;

public class Lesson9 {
    public static void main(String[] args) {
        int t = 0;
        int x = 0;
        int y = 0;
        for (String str : args) {  // Аргументы 1 2 33 4 55 7
            if (t < args.length) {
                if ((Integer.parseInt(args[t]) % 2) == 0) {
                }  else {
                    System.out.println("аргумент " + t + " = " + args[t] + " не четный");
                }
                t++;
            }
        }
        for (int i = 0; i < args.length; i++){
            System.out.print(Integer.parseInt(args[i]) + " ");
        }
        // Аргументы 1 22 33 4 55 7
        System.out.println();
        Scaner.scaner(4);
        System.out.println("If");
        while (x < args.length) {
            Scaner.dayWeekIf(Integer.parseInt(args[x]));
            x++;
        }

        // Аргументы 1 22 33 4 55 7
        System.out.println("Switch");
        while (y < args.length) {
            Scaner.dayWeekSwitch(Integer.parseInt(args[y]));
            y++;
        }
        Scaner.writeTask();
        Scaner.numberDivide();
        Scaner.fiveSibmols();
    }
}
