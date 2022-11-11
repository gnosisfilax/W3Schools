package classes.modifiers.abstractModifier;

public class Second {
    public static void main(String[] args) {
        // Create an object of the student class (which inherits attributes and methods from Main)
        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study(); // Call abstract method
    }
}
