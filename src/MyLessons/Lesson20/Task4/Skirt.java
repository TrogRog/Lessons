package MyLessons.Lesson20.Task4;

public class Skirt extends Clothes implements WomanClothes {
    public Skirt(SizeClothes sizeClothesAll, int price, String color) {

        super(sizeClothesAll, price, color);
    }

    @Override
    public void dressWoman() {

    }
    @Override
    public String toString() {
        return "Юбка{" +
                "размер = " + getSizeClothesAll() +
                ", цена = " + getPrice() + " " +
                ", цвет = " + getColor() +
                "}";
    }
}
