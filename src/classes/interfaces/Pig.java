package classes.interfaces;

//Pig "implements" the Animal interface
class Pig implements Animal{
    public void animalSound() {
        //The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        //The body of sleep() id provided here
        System.out.println("Zzz");
    }
}
