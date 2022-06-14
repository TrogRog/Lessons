package MyLessons.Lesson20.Task4;

public class SizeClothesMain {
    public static void main(String[] args) {

        for (SizeClothes sizeClothes : SizeClothes.values()) {
            System.out.println(sizeClothes + " " + sizeClothes.getEuroSize() + " " + sizeClothes.getDescription());
        }
        System.out.println("--------------");
        Clothes[] clothes = {
                new Pants(SizeClothes.M, 100, "Red"),
                new Tie(SizeClothes.L, 200, "Orange"),
                new Skirt(SizeClothes.XXS, 220, "Yellow"),
                new Tshirt(SizeClothes.S, 150, "Blue")
        };

        Studio studio = new Studio();
        studio.dressMan(clothes);
        studio.dressWoman(clothes);
    }
}
