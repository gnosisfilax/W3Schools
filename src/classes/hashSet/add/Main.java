package classes.hashSet.add;

import java.util.HashSet;

//A HashSet is a collection of items where every item is unique
public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
    }
}
/*
Note: In the example above, even though BMW is added twice it only appears once in the set because every item in a set has to be unique.
 */
