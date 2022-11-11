package classes.methods;

public class AccessMethods {

    //fullThrottle() method
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }

    //speed method() method and add a parameter
    public void speed(int maxSpeed){
        System.out.println("Max speed is: " + maxSpeed);
    }

    //Inside main, call the methods on the myCar object
    public static void main(String[] args) {
        AccessMethods myCar = new AccessMethods();
        myCar.fullThrottle();
        myCar.speed(200);
    }

}
