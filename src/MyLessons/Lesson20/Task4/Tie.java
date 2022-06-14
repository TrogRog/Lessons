package MyLessons.Lesson20.Task4;

public class Tie extends Clothes implements ManClothes {
    public Tie(SizeClothes sizeClothesAll, int price, String color) {
        super(sizeClothesAll, price, color);
    }

    @Override
    public void dressMan() {

    }
    @Override
    public String toString() {
        return "Галстук{" +
                "размер = " + getSizeClothesAll() +
                ", цена = " + getPrice() + " " +
                ", цвет = " + getColor() +
                "}";
    }
}
