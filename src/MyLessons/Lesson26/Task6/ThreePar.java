package MyLessons.Lesson26.Task6;

import javax.xml.catalog.Catalog;
import java.io.Serializable;

public class ThreePar<T extends String, V extends Animal & Serializable, K extends Number> {
    private T ob1;
    private V ob2;
    private K ob3;

    public ThreePar(T ob1, V ob2, K ob3) {
        this.ob1 = ob1;
        this.ob2 = ob2;
        this.ob3 = ob3;
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public K getOb3() {
        return ob3;
    }

    public void showTypes() {
        System.out.println("ob1: " + ob1.getClass().getName());
        System.out.println("ob2: " + ob2.getClass().getName());
        System.out.println("ob3: " + ob3.getClass().getName());
    }

    public static void main(String[] args) {
        ThreePar<String, Cat, Integer> threePar = new ThreePar<>("разраз", new Cat(), 4);
        threePar.showTypes();
        System.out.println("Значение T: " + threePar.getOb1());
        System.out.println("Значение V: " + threePar.getOb2());
        System.out.println("Значение K: " + threePar.getOb3());
    }
}
