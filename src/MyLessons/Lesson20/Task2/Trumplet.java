package MyLessons.Lesson20.Task2;

import java.util.Objects;

public class Trumplet implements Instrument {

    private int diameter;

    public Trumplet(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }


    @Override
    public void play() {
        System.out.println("Играет Trumplet с диметром "+ getDiameter());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trumplet trumplet = (Trumplet) o;
        return diameter == trumplet.diameter;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diameter);
    }

    @Override
    public String toString() {
        return "Труба{" +
                "diameter=" + diameter +
                '}';
    }
}
