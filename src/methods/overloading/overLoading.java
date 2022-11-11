package methods.overloading;

public class overLoading {
    static int myMethod(int x, int y){
        return x + y;
    }
    static double myMethod(double x, double y){
        return x + y;
    }
    /*
    Instead of defining two methods that should do the same thing, it is better to overload one,
    we overload the method to work for both int and double:
     */
    public static void main(String[] args) {
        int add1 = myMethod(8,5);
        double add2 = myMethod(4.3, 6.26);
        System.out.println("Addition of two integer numbers: " + add1);
        System.out.println("Addition of two double numbers: " + add2);
    }
}
