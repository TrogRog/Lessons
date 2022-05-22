package MyLessons.Lesson11;

import java.util.Arrays;

public class Lesson11 {
    public static void main(String[] args) {
        //задание 1
        System.out.println("Задание 1");
        String[] weekDays = new String[7];
        weekDays[0] = "Понедельник";
        weekDays[1] = "Вторник";
        weekDays[2] = "Среда";
        weekDays[3] = "Четверг";
        weekDays[4] = "Пятница";
        weekDays[5] = "Суббота";
        weekDays[6] = "Воскресенье";
        System.out.println(weekDays[6]);

        //задание 2
        System.out.println();
        System.out.println("Задание 2");
        double[] test = {12.4, 34.8, 66, 43};
        System.out.println(test[0]);

        //задание 3
        System.out.println();
        System.out.println("Задание 3");
        String[][] massiveMy = new String[3][6];
        char symbol = 'a';
        for (int i = 0; i < massiveMy.length; i++) {
            for (int j = 0; j < massiveMy[0].length; j++) {
                massiveMy[i][j] = String.valueOf(symbol);
                System.out.print(massiveMy[i][j] + (j + 1) + " ");
            }
            symbol++;
            System.out.println();
        }

        //задание 4
        System.out.println();
        System.out.println("Задание 4");
        char[][] twoMassive = {
                {'z', 'x'},
                {'c', 'v'},
                {'b', 'n'},
                {'m', 'h'}
        };
        for (char[] first : twoMassive) {
            for (char second : first) {
                System.out.print(second + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(twoMassive));


        //задание 5
        System.out.println();
        System.out.println("Задание 5");
        int[][] firstMassive = {
                {2, 20, 42, 3, 50, 3, 100, 45},
                {32, 43, 56, 4523, 2, 423, 5, 32},
                {12, 342, -43, 5, 2, -412, 4, 4},
                {234, 23, 43, 12, 84, 54, 3, 5},
                {1, 2, 3, 4, 8, -7, 6, 5}
        };

        for (int i = 0; i < firstMassive.length; i++) {
            for (int j = 0; j < firstMassive[0].length; j++) {
                System.out.print(firstMassive[i][j] + " ");
            }
            System.out.println();
        }
        int[][] secondMassive = new int[5][2];
        for (int i = 0; i < firstMassive.length; i++) {
            int min = firstMassive[i][0];
            int max = firstMassive[i][0];
            int j;
            for (j = 0; j < firstMassive[0].length; j++) {
                if (min > firstMassive[i][j]) {
                    min = firstMassive[i][j];
                }
                if (max < firstMassive[i][j]) {
                    max = firstMassive[i][j];
                }
            }
            secondMassive[i][0] = min;
            secondMassive[i][1] = max;

        }
        System.out.println("[мин.,макс.]");
        System.out.println(Arrays.deepToString(secondMassive));

        //задание 6
        System.out.println();
        System.out.println("Задание 6");
        int[] garland = {0, 1, 2, 3, 4};
        System.out.println(Arrays.toString(garland));
        for (int i = 0; i < garland.length -1 ; i++) {
            System.arraycopy(garland, i, garland, i + 1, garland.length - (i + 1));
            System.out.println(Arrays.toString(garland));
        }
    }
}

