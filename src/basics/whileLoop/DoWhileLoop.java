package basics.whileLoop;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        //The loop will always be executed at least once, even if the condition is false.
        do {
            System.out.println(i);
            i++;//Do not forget to increase the variable used in the condition, otherwise the loop will never end!
        }
        while (i < 5);
    }
}
