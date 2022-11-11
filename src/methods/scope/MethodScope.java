package methods.scope;

public class MethodScope {
    public static void main(String[] args) {
        // Code here CANNOT use x
        //System.out.println(x);
        int x = 100;
        // Code here can use x
        System.out.println(x);
    }
}
