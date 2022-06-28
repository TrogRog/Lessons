package MyLessons.Lesson26.Task5;

public class Food {


    public void prepare(Cookable c, String str) {
        c.cook(str);
    }


    public static void main(String[] args) {
        Food food1 = new Food();
        Cookable cookable1=new Cookable() {
            @Override
            public void cook(String str) {
                Cookable.super.cook(str);
            }
        };
        food1.prepare(cookable1,"Food123");
    }
}