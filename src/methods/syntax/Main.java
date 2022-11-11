package methods.syntax;

public class Main {

   static void myMethod(){
       //myMethod() is the name of the method.
       //static means that the method belongs to the Main class and not an object of the Main class.
       //void means that this method does not have a return value.
       System.out.println("I just got executed");
    }
    public static void main(String[] args) {
        myMethod();
    }
}
