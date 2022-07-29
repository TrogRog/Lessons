package MyLessons.Lesson38.Task4;

import java.util.ArrayList;
import java.util.List;

class Obj {
    private List<Double> list;
    int number;

    public Obj(int number) {
        this.number = number;
        list = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            list.add(Math.random());
        }
    }

    @Override
    public String toString() {
        return "" + number;
    }

}
