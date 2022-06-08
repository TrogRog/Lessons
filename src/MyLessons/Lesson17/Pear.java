package MyLessons.Lesson17;

public class Pear extends Fruit {
    private double price;

    public Pear(double weight, double price) {
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
        System.out.println("Стоимость Pear: " + getWeight() * getPrice());
        return getPrice()*getWeight();
    }
}
