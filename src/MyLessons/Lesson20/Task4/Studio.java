package MyLessons.Lesson20.Task4;

public class Studio {


    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда :");
        for (Clothes clothe : clothes) {
            if (clothe instanceof ManClothes) {
                System.out.println(clothe +" ");
            }
        }
    }

    public void dressWoman(Clothes[] clothes) {
        System.out.println("Женская одежда :");
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomanClothes) {
                System.out.println(clothe);
            }
        }
    }
}
