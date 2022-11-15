package classes.hashMap.otherTypes;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<>();

        // Add Keys and Values (Name, age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()){
            System.out.println("Key: " + i + " Value: " + people.get(i));
        }

    }
}
