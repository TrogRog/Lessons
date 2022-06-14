package MyLessons.Lesson20.Task4;

import java.util.Objects;

public abstract class Clothes {
    private SizeClothes sizeClothesAll;
    private int price;
    private String color;

    public Clothes(SizeClothes sizeClothesAll, int price, String color) {
        this.sizeClothesAll = sizeClothesAll;
        this.price = price;
        this.color = color;
    }

    public SizeClothes getSizeClothesAll() {
        return sizeClothesAll;
    }

    public void setSizeClothesAll(SizeClothes sizeClothesAll) {
        this.sizeClothesAll = sizeClothesAll;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothes clothes = (Clothes) o;
        return sizeClothesAll == clothes.sizeClothesAll && price == clothes.price && Objects.equals(color, clothes.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sizeClothesAll, price, color);
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "sizeClothesAll=" + sizeClothesAll +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
