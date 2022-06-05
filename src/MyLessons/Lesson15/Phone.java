package MyLessons.Lesson15;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Phone {
    private String number;
    private String model;
    private Double weight;

    public Phone(String number, String model, Double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone() {
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " с номера " + number);
    }

    String getNumber() {
        return number;
    }

    void sendMessage(String... numbers) {
        for (String a : numbers) {
            System.out.println("Номер: " + a);
        }
    }

    public void print() {
        System.out.println(this.getNumber());
        System.out.println(this.model);
        System.out.println(this.weight);
    }
}
