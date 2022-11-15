package classes.arrayList.clear;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        // Remove all the elements in the ArrayList
        cars.clear();
        System.out.println(cars);
    }
}
