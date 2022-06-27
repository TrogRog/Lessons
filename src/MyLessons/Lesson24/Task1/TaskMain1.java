package MyLessons.Lesson24.Task1;

public class TaskMain1 {
    public static void main(String[] args) {
        likeString("I like Java!!!");

    }

    private static void likeString(String str) {
        System.out.println(str);
        System.out.println("Последний символ: " + str.charAt(str.length() - 1));
        System.out.println("Окончание !!! : " + str.endsWith("!!!"));
        System.out.println("Начало I like : " + str.startsWith("I like"));
        System.out.println("Есть Java: " + str.contains("Java"));
        System.out.println("Позиция Java : " + str.indexOf("Java"));
        System.out.println("Замена : " + str.replace("a", "o"));
        System.out.println("Нижний регистр : " + str.toLowerCase());
        System.out.println("Верхний регистр : " + str.toUpperCase());
        System.out.println("Вырезание : " + str.substring(7, 11));
    }
}
