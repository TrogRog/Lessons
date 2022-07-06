package MyLessons.Lesson30.Task4;

public class Product {
    String name;

    Product() {
    }

    Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
