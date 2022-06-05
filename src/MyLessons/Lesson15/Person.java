package MyLessons.Lesson15;

public class Person {
    private String fullName;
    private int age;

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    Person() {
    }

    void talk() {
        System.out.println(fullName + " говорит");
    }

    void move() {
        System.out.println(fullName + " двигается");
    }

    public void print(){
        System.out.println("Name: " + this.fullName + "   Age: " + this.age);
    }
}
