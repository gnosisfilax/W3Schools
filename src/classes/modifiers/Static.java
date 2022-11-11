package classes.modifiers;

public class Static {
    //Static method
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }

    //Public method
    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }

    //main method
    public static void main(String[] args) {
        myStaticMethod();// Call ths static method
        // myPublicMethod(); This would output an error

        Static myObj = new Static();
        myObj.myPublicMethod();

    }
}
