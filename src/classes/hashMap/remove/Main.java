package classes.hashMap.remove;

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
        capitalCities.remove("England");
        System.out.println(capitalCities);
        // Removing all
        capitalCities.clear();
        System.out.println(capitalCities);
    }
}
