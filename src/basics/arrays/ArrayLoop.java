package basics.arrays;

public class ArrayLoop {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }
        System.out.println("\n");
        for (String i : cars) {//For Each loop
            System.out.println(i);
        }
    }
}
