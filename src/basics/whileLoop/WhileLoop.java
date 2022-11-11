package basics.whileLoop;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5){
            System.out.println(i);
            i++;//Do not forget to increase the variable used in the condition, otherwise the loop will never end!
        }
    }
}
