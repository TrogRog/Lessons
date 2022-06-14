package MyLessons.Lesson20.Task5;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Item {
    static Set<Category> categories = new HashSet();
    static int lastIndex = 0;

    private String name;
    private int price;
    Category category;
    private int index;


    public Item(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.index = ++lastIndex;
        categories.add(category);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", index=" + index +
                '}';
    }
}
