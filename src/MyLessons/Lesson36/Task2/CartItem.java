package MyLessons.Lesson36.Task2;

import java.io.Serializable;

public class CartItem implements Serializable {
    Item item;
    Integer amount;

    public CartItem(Item item, Integer amount) {
        this.item = item;
        this.amount = amount;
    }
}
