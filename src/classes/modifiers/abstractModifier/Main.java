package classes.modifiers.abstractModifier;

abstract class Main {
    public String fname = "Guillermo";
    public int age = 34;
    public abstract void study(); // Abstract method
}

//Subclass (inherit from Main)
class Student extends Main{
    public int graduationYear = 2009;
    public void study(){ // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}