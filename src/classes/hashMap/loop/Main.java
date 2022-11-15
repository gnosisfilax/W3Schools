package classes.hashMap.loop;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        // Print keys
        for (String i : capitalCities.keySet()){
            System.out.println(i);
        }

        // Print values
        for (String i : capitalCities.values()){
            System.out.println(i);
        }

        // Print Keys and Values
        for (String i : capitalCities.keySet()){
            System.out.println("Key: " + i + " Value: " + capitalCities.get(i) );
        }
    }
}
