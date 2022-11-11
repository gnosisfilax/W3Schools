package classes.methods;

public class StaticNonStatic {
    //Static method
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }

    //Public method
    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }

    //Main method
    public static void main(String[] args) {
        myStaticMethod();
        //myPublicMethod(); //This would compile an error

        StaticNonStatic myObj = new StaticNonStatic();// Create an object of StaticNonStatic
        myObj.myPublicMethod();//Call the public method on the object
    }
}
