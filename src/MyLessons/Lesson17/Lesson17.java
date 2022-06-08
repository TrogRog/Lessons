package MyLessons.Lesson17;


public class Lesson17 {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        Phone phone1 = new Phone("8111111", "Samsung", 11.1);
        Phone phone2 = new Phone("8222222", "Nokia", 22.2);
        Phone phone3 = new Phone("8333333", "Apple", 33.3);
        System.out.println("Количество телефонов: " + Phone.getCount());

        //Задание 2
        System.out.println("------------------------");
        System.out.println("Заданпие 2");
        Rose flower1 = new Rose("France", 5, 200, "Роза");
        Lily flower2 = new Lily("Russia", 3, 300, "Лилия");
        Tulip flower3 = new Tulip("Italy", 4, 250, "Тюльпан");
        Aster flower4 = new Aster("Spain", 1, 270, "Астра");
        Flower[] bouquet1 = {flower1, flower1, flower3};
        Flower.getBouquetCost(bouquet1);
        Flower[] bouquet2 = {flower2, flower3, flower4};
        Flower.getBouquetCost(bouquet2);
        Flower[] bouquet3 = {flower3, flower4, flower1};
        Flower.getBouquetCost(bouquet3);
        System.out.println("Колличество проданных цветов: " + Flower.getCountFlowers());

        //Задание 3
        System.out.println("------------------------");
        System.out.println("Заданпие 3");
        Fruit[] fruits = new Fruit[3];
        fruits[0] = new Apple(11, 11);
        fruits[1] = new Apricot(15, 9);
        fruits[2] = new Pear(12, 8);
        System.out.println("Вся покупка: " + (fruits[0].costFruit() +
                fruits[1].costFruit() +
                fruits[2].costFruit()));

        //Задание 4
        System.out.println("------------------------");
        System.out.println("Заданпие 4");
        Cicle cicle1 = new Cicle(4);
        Cicle cicle2 = new Cicle(12);
        cicle1.area();
        cicle1.lengthCircle();
        cicle2.area();
        cicle2.lengthCircle();
    }
}


