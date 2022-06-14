package MyLessons.Lesson20.Task4;

public class Tshirt extends Clothes implements ManClothes,WomanClothes{

    public Tshirt(SizeClothes sizeClothesAll, int price, String color) {
        super(sizeClothesAll, price, color);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }
    @Override
    public String toString() {
        return "Футболка{" +
                "размер = " + getSizeClothesAll() +
                ", цена = " + getPrice() + " " +
                ", цвет = " + getColor() +
                "}";
    }
}
