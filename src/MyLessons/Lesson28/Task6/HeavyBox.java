package MyLessons.Lesson28.Task6;

import java.util.function.Consumer;

public class HeavyBox {
    private double weigth;

    public HeavyBox(double weigth) {
        this.weigth = weigth;
    }


    @Override
    public String toString() {
        return "HeavyBox{" +
                "weigth=" + weigth +
                '}';
    }

    public static void main(String[] args) {
        Consumer<HeavyBox> heavyBoxConsumer1 = heavyBox -> System.out.println("Отгрузили ящик с весом n: " + heavyBox.toString());
        Consumer<HeavyBox> heavyBoxConsumer2 = heavyBox -> System.out.println("Отправляем ящик с весом n: " + heavyBox.toString());
        heavyBoxConsumer1.andThen(heavyBoxConsumer2).accept(new HeavyBox(24.3));
    }
}
