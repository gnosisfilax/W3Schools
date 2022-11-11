package basics.arrays;

public class Arrays {
    public static void main(String[] args) {

        String[] cars;
        cars = new String[]{"Volvo", "BMW", "Ford", " Mazda"};
        int[] myNums = {10, 20, 30, 40, 50};

        System.out.println("The second element of myNums array is: " + myNums[1]);
        System.out.println("The first element os cars array is: " + cars[0]);//You access an array element by referring to the index number.
        cars[0] = "Opel";//To change the value of a specific element, refer to the index number:
        System.out.println("The new first element of cars array is: " + cars[0]);
        System.out.println("The length of cars array is: " + cars.length);
        System.out.println("The length of myNums array is: " + myNums.length);
    }
}
