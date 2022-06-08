package MyLessons.Lesson17;

public class Flower {
    private String Country;
    private int daysSave;
    private double price;

    static int countFlowers;

    public Flower(String country, int daysSave, double price) {
        Country = country;
        this.daysSave = daysSave;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public static int getCountFlowers() {
        return countFlowers;
    }

    public static double getBouquetCost(Flower[] bouquet) {
        double cost = 0.0;
        for (Flower flower : bouquet) {
            cost = cost + flower.getPrice();
            countFlowers++;
        }
        System.out.println("Цена букета: " + +cost);
        return cost;
    }
}
