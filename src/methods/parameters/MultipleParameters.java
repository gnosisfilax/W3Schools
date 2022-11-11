package methods.parameters;

public class MultipleParameters {
    static void myMethod(String fname, int age){
        System.out.println(fname + " is " + age + " years old.");
    }

    public static void main(String[] args) {
        myMethod("Guillermo", 34);
        myMethod("Nayiberth", 23);
        myMethod("Sofía", 1);
    }
}
