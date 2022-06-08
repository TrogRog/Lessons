package MyLessons.Lesson17;

public abstract class Fruit {
    private double weight;
    static double cost;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract double costFruit();
}
