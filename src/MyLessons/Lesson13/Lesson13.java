package MyLessons.Lesson13;

import java.util.Arrays;

public class Lesson13 {
    public static void main(String[] args) {
        int[] test1 = new int[]{0, 2, 5, 3, 4};
        int[] test2 = new int[]{3, 4, 5, 10, 2, 1};
        int[] test3 = new int[]{0, 2, 5, 3, 4};
        int[] test4 = new int[]{0, 2, 1, 3, 4};
        System.out.println("Задание 1");
        System.out.println("начальный массив" + Arrays.toString(test1));
        System.out.println("i j                     if");
        BubbleSorter1.sort(test1);
        System.out.println("Задание 2");
        System.out.println("начальный массив" + Arrays.toString(test2));
        BubbleSorter2.sort(test2);
        System.out.println("Задание 3");
        System.out.println("начальный массив" + Arrays.toString(test3));
        SelectionSorter1.sort(test3);
        System.out.println("Задание 4");
        System.out.println("начальный массив" + Arrays.toString(test4));
        SelectionSorter2.sort(test4);

    }
    //Задание 1
    static class BubbleSorter1 {
        public static void sort(int[] array) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = array.length - 1; j > i; j--) {
                    if (array[j - 1] > array[j]) {
                        int tmp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = tmp;
                        System.out.println(i + " " + j + " " + Arrays.toString(array) + "     +");
                    } else {
                        System.out.println(i + " " + j + " " + Arrays.toString(array) + "     -");
                    }
                }
            }
            System.out.println("конечный массив" + Arrays.toString(array));
        }
    }
    //Задание 2
    static class BubbleSorter2 {
        public static void sort(int[] array) {
            boolean isSorted;
            int countLine = 1;
            for (int i = 0; i < array.length - 1; i++) {
                isSorted = true;
                for (int j = array.length - 1; j > i; j--) {
                    if (array[j - 1] < array[j]) {
                        System.out.println((countLine++) + " | " + i + " " + j + " " + Arrays.toString(array) + "     +");
                        isSorted = false;
                        int tmp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = tmp;
                    } else {
                        System.out.println((countLine++) + " | " + i + " " + j + " " + Arrays.toString(array) + "     -");
                    }
                }
                if (isSorted) break;
            }
            System.out.println("конечный массив" + Arrays.toString(array));
        }
    }
    //Задание 3
    static class SelectionSorter1 {
        public static void sort(int[] array) {
            for (int i = 0; i < array.length; i++) { // i - номер текущего шага
                int pos = i;
                int min = array[i];
// цикл выбора наименьшего элемента
                String isEnter = "-";
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < min) {
                        isEnter = "+";
                        pos = j; // pos - индекс наименьшего элемента
                        min = array[j];
                    }
                }
                array[pos] = array[i];
                array[i] = min; // меняем местами наименьший с array[i]
                System.out.println(i + " " + pos + " " + Arrays.toString(array) + isEnter);
            }
            System.out.println("конечный массив" + Arrays.toString(array));
        }
    }
    //Задание 4
    static class SelectionSorter2 {
        public static void sort(int[] array) {
            for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
                int pos = i;
                int min = array[i];
                // цикл выбора наименьшего элемента
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < min) {
                        pos = j;    // pos - индекс наименьшего элемента
                        min = array[j];
                    }
                }
                if (pos != i) {
                    array[pos] = array[i];
                    array[i] = min; // меняем местами наименьший с array[i]
                } else {
                    System.out.println(pos + " элемент на своем месте");
                }
            }
            System.out.println("конечный массив" + Arrays.toString(array));
        }
    }
}

