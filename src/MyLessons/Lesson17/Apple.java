package MyLessons.Lesson17;

public class Apple extends Fruit {
    private double price;

    public Apple(double weight, double price) {
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
        System.out.println("Стоимость Apple: " + getWeight() * getPrice());
        return getPrice()*getWeight();
    }
}
