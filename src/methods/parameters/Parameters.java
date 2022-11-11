package methods.parameters;

public class Parameters {
    static void myMethod(String fname){
        System.out.println("Hello, " + fname);
    }

    public static void main(String[] args) {
        myMethod("Guillermo");
        myMethod("Nayiberth");
        myMethod("Sofía");
    }
}
