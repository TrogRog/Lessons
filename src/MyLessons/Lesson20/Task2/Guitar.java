package MyLessons.Lesson20.Task2;

import java.util.Objects;

public class Guitar implements Instrument {

    private int numberStrings;

    public Guitar(int numberStrings) {
        this.numberStrings = numberStrings;
    }

    public int getNumberStrings() {
        return numberStrings;
    }

    public void setNumberStrings(int numberStrings) {
        this.numberStrings = numberStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет Guitar с " + getNumberStrings() + " струнами");
    }

    @Override
    public String toString() {
        return "Гитара{" +
                "numberStrings=" + numberStrings +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guitar guitar = (Guitar) o;
        return numberStrings == guitar.numberStrings;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberStrings);
    }
}
