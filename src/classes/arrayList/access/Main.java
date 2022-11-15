package classes.arrayList.access;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        //Access an Item
        System.out.println(cars.get(0));
        System.out.println(cars.get(1));
        System.out.println(cars.get(2));
        System.out.println(cars.get(3));
    }
}
