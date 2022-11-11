package basics.math;

public class Mathe {
    public static void main(String[] args) {

        System.out.println("The highest value of 5 and 10 is: " + Math.max(5, 10));

        System.out.println("The lowest value of 5 and 10 is: " + Math.min(5, 10));

        System.out.println("The square root of 64 is: " + Math.sqrt(64));

        System.out.println("The absolute value of -4.7 is: " + Math.abs(-4.7));

        System.out.println("Math.random returns a random number between 0.0(inclusive), and 1.0(exclusive) :" + Math.random());

        System.out.println("To return a random number between 0 and 100: " + Math.random()*101);
    }
}
