package MyLessons.Lesson20.Task4;

public class Pants extends Clothes implements ManClothes,WomanClothes {

    public Pants(SizeClothes sizeClothesAll, int price, String color) {
        super(sizeClothesAll, price, color);
    }

    @Override
    public  void dressMan() {

    }

    @Override
    public void dressWoman() {

    }
    @Override
    public String toString() {
        return "Штаны{" +
                "размер = " + getSizeClothesAll() +
                ", цена = " + getPrice() + " " +
                ", цвет = " + getColor() +
                "}";
    }
}
