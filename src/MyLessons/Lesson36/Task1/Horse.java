package MyLessons.Lesson36.Task1;

import java.io.Serializable;

public class Horse extends Animal implements Serializable {

    private String breed;

    public Horse(int age, String breed) {
        super(age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Horse{age= " + getAge() +
                ", breed='" + getBreed() + '\'' +
                '}';
    }
}
