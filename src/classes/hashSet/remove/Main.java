package classes.hashSet.remove;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        cars.remove("Volvo");
        System.out.println(cars);
        // Remove all items
        cars.clear();
        System.out.println(cars);
    }
}
