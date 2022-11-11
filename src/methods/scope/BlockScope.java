package methods.scope;

public class BlockScope {
    public static void main(String[] args) {
        // Code here CANNOT use x
        //System.out.println(x);
        { // This is a block
            // Code here CANNOT use x
            //System.out.println(x);
            int x = 100;
            // Code here CAN use x
            System.out.println(x);
        } // The block ends here
        // Code here CANNOT use x
        //System.out.println(x);
    }
}
