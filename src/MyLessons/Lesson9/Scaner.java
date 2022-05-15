package MyLessons.Lesson9;

import java.sql.SQLOutput;

public class Scaner {
    static void scaner(int number) {

        if (number <= 10 && number >= 0) {
            System.out.println("Положительное число меньше 10");
        } else System.out.println("Положительное число больше 10 или отрицательное");
    }

    static void dayWeekIf(int numberDay) {
        if (numberDay == 1) {
            System.out.println(numberDay + " Понедельник ");
        } else if (numberDay == 2) {
            System.out.println(numberDay + " Вторник");
        } else if (numberDay == 3) {
            System.out.println(numberDay + " Среда");
        } else if (numberDay == 4) {
            System.out.println(numberDay + " Четверг");
        } else if (numberDay == 5) {
            System.out.println(numberDay + " Пятница");
        } else if (numberDay == 6) {
            System.out.println(numberDay + " Суббота");
        } else if (numberDay == 7) {
            System.out.println(numberDay + " Воскресенье");
        }
    }

    static void dayWeekSwitch(int numberDay) {
        switch (numberDay) {
            case 1:
                System.out.println(numberDay + " Понедельник ");
                break;
            case 2:
                System.out.println(numberDay + " Вторник ");
                break;
            case 3:
                System.out.println(numberDay + " Среда ");
                break;
            case 4:
                System.out.println(numberDay + " Четверг ");
                break;
            case 5:
                System.out.println(numberDay + " Пятница ");
                break;
            case 6:
                System.out.println(numberDay + " Суббота ");
                break;
            case 7:
                System.out.println(numberDay + " Воскресенье ");
                break;

        }
    }

    static void writeTask() {
        int taskNumber = 1;
        while (taskNumber < 11) {
            System.out.print("Task" + taskNumber + " ");
            taskNumber += 1;
        }

    }

    static void numberDivide() {
        int tik = 1;
        System.out.println();
        do {
            if (tik % 5 == 0) {
                System.out.print(tik + " ");
            }
            tik++;
        } while (tik <= 100);
    }

    static void fiveSibmols() {
        char simbol = 'h';
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(simbol++ + " ");
        }
    }
}


