package methods.parameters;

public class MethodIfElse {
    static void checkAge(int age){
        if (age < 18){
            System.out.println("Acces denied - You are ot old enough!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(20);
    }
}
