package MyLessons.Lesson17;

public class Lily extends Flower{
    private String name;

    public Lily(String country, int daysSave, double price, String name) {
        super(country, daysSave, price);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
