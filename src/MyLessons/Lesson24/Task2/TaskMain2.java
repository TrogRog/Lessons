package MyLessons.Lesson24.Task2;

public class TaskMain2 {
    public static void main(String[] args) {
        //a
        StringBuilder stringBuilder1 = mathString(3, 56);
        System.out.println(stringBuilder1);
        //б
        modifyString(stringBuilder1);
        System.out.println(stringBuilder1);
        //в
        modString(stringBuilder1);
        System.out.println(stringBuilder1);

    }

    private static StringBuilder mathString(int a, int b) {
        StringBuilder result = new StringBuilder();
        System.out.println("a) ");
        result.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
        result.append(a).append(" - ").append(b).append(" = ").append(a - b).append(("\n"));
        result.append(a).append(" * ").append(b).append(" = ").append(a * b).append(("\n"));
        return result;
    }

    private static StringBuilder modifyString(StringBuilder stringBuilder) {
        int pos;
        System.out.println("б) StringBuilder.insert(), StringBuilder.deleteCharAt()");
        while ((pos = stringBuilder.indexOf("=")) != -1) {
            stringBuilder.deleteCharAt(pos).insert(pos, "равно");
        }
        return stringBuilder;
    }


    private static StringBuilder modString(StringBuilder stringBuilder) {
        int pos;
        System.out.println("в) StringBuilder.replace()");
        while ((pos = stringBuilder.indexOf("=")) != -1) {
            stringBuilder.replace(pos, pos + 1, "равно");
        }
        return stringBuilder;
    }


}
