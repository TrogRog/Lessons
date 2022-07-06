package MyLessons.Lesson30.Task2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class TaskMain2 {
    public static void main(String[] args) {
        System.out.println("Enter numbers (EXAMPLE 1 2 3 4 5 12 135 23 etc...): ");
        String numbers = new Scanner(System.in).nextLine();
        Set<String> set = new HashSet<String>();
        set.addAll(Arrays.asList(numbers.split(" ")));
        System.out.println(set);
    }
}