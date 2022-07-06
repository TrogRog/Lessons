package MyLessons.Lesson30.Task1;

import java.util.function.Consumer;

public class HeavyBox {
    private double weigth;

    public HeavyBox(double weigth) {
        this.weigth = weigth;
    }

    public double getWeigth() {
        return weigth;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weigth=" + weigth +
                '}';
    }


}
