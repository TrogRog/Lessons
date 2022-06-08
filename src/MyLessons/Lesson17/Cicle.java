package MyLessons.Lesson17;

public class Cicle {
    private double radius;
    public static final double PI = 3.14;

    public Cicle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        System.out.println("Плозадь круга:"+PI*radius*radius);
        return PI*radius*radius;
    }

    public double lengthCircle(){
        System.out.println("Длина окружности: "+PI*2*radius);
        return PI*2*radius;
    }
}
