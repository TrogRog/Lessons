package MyLessons.Lesson22;

public class LessMain {
    public static void main(String[] args) {
        Double double1 = Double.valueOf(15);
        System.out.println(double1);
        Double double2 = Double.parseDouble("64");
        System.out.println(double2);
        System.out.println("-----------------");
        System.out.println(double1.byteValue());
        System.out.println(double1.shortValue());
        System.out.println(double1.intValue());
        System.out.println(double1.longValue());
        System.out.println(double1.floatValue());
        System.out.println(double1.doubleValue());
        System.out.println("-----------------");
        String d = Double.toString(5);
        System.out.println(d);
    }
}
