package MyLessons.Lesson20.Task2;

import java.util.Objects;

public class Drum implements Instrument {

    private int size;

    public Drum(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет Drum с размером " + getSize());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drum drum = (Drum) o;
        return size == drum.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }

    @Override
    public String toString() {
        return "Барабан{" +
                "size=" + size +
                '}';
    }
}
