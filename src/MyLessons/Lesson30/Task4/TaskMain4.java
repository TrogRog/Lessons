package MyLessons.Lesson30.Task4;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class TaskMain4 {
    public static void main(String[] args) {
        Map<String, Product> toys = new HashMap<>();
        toys.put("Робот", new Product("Робот"));
        toys.put("Кролик", new Product("Кролик"));
        toys.put("Мишка", new Product("Мишка"));
        toys.put("Белка", new Product("Белка"));

        printKeys(toys);
        printEntries(toys);
        printValues(toys);
    }

    static void printEntries(Map<String, Product> toys) {
        toys.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));
    }

    static void printValues(Map<String, Product> toys) {
        Collection<Product> values = toys.values();
        for (Product value : values) {
            System.out.println(value);
        }
    }

    static void printKeys(Map<String, Product> toys) {
        Set<String> keys = toys.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
    }






}
