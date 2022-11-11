package classes.abstraction;

//Abstract class
abstract class Animal {
    //Abstract method (does not have body)
    public abstract void animalSound();
    //Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}
