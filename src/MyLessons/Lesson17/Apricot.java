package MyLessons.Lesson17;

public class Apricot extends Fruit {
    private double price;

    public Apricot(double weight, double price) {
        super(weight);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double costFruit() {
        System.out.println("Стоимость Apricot: " + getWeight() * getPrice());
        return getPrice()*getWeight();
    }
}
