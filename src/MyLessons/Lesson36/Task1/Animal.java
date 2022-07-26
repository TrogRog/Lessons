package MyLessons.Lesson36.Task1;

import java.io.Serializable;

public class Animal implements Serializable {
    private int age;

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
