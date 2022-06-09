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

    final void printManufacturerInfo(){
        System.out.print("Made in Ukraine");}

    public abstract double costFruit();
}
