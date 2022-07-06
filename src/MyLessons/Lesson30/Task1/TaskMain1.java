package MyLessons.Lesson30.Task1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskMain1 {
    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(10));
        boxes.add(new HeavyBox(11));
        boxes.add(new HeavyBox(12));
        boxes.add(new HeavyBox(13));
        boxes.add(new HeavyBox(14));
        boxes.forEach(b -> System.out.println("box: " + b.getWeigth()));

        System.out.println("----------------");
        boxes.set(0, new HeavyBox(1));
        boxes.forEach(b -> System.out.println("box: " + b.getWeigth()));

        System.out.println("----------------");
        boxes.remove(4);
        boxes.forEach(b -> System.out.println("box: " + b.getWeigth()));

        System.out.println("----------------");
        System.out.println("массив 1");
        Object[] objectList = boxes.toArray();
        System.out.println(Arrays.toString(objectList));


        System.out.println("----------------");
        System.out.println("массив 2");
        HeavyBox[] heavyBoxes1 = new HeavyBox[boxes.size()];
        boxes.toArray(heavyBoxes1);
        System.out.println(Arrays.toString(heavyBoxes1));

        System.out.println("----------------");
        System.out.println("массив 3");
        HeavyBox[] heavyBoxes2 = boxes.toArray(new HeavyBox[0]);
        System.out.println(Arrays.toString(heavyBoxes2));

        boxes.clear();

    }
}
