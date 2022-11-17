package classes.exceptions;

public class Main {
    public static void main(String[] args) {

        try {
            int[] myNumbers = {1,2,3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            assert System.out != null;
            System.out.println("Something went wrong");
        }
    }
}
