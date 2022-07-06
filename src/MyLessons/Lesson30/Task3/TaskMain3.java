package MyLessons.Lesson30.Task3;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskMain3 {
    public static void main(String[] args) {

        List<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(100));
        boxes.add(new HeavyBox(150));
        boxes.add(new HeavyBox(200));
        boxes.add(new HeavyBox(400));
        boxes.add(new HeavyBox(500));
        boxes.forEach(b -> System.out.println("box: " + b.getWeigth()));

        List<HeavyBox> newBoxesList = sort(boxes, 300);
        System.out.println("List>300: " + newBoxesList);
        System.out.println("List<300: " + boxes);

    }


    public static List<HeavyBox> sort(List<HeavyBox> boxes, int weight) {
        List<HeavyBox> resultList = new ArrayList<>();
        Iterator<HeavyBox> iterator = boxes.listIterator();
        while (iterator.hasNext()) {
            HeavyBox currentBox = iterator.next();
            if (currentBox.getWeigth() > weight) {
                resultList.add(currentBox);
                iterator.remove();
            }
        }
        return resultList;

    }
}