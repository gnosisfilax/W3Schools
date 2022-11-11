package methods.parameters;

public class ReturnValues{
    static int myMethod(int x){
        return 5 + x;
    }

    static int myMethod2(int x, int y){
        return x + y;
    }

    static int myMethod3(int x, int y){
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println("The addition of 5 to x = 3, is: " + myMethod(3));
        System.out.println("the addition of x = 5 to y = 3, is: " + myMethod2(5,3));
        int z = myMethod3(5,3);//You can also store the result in a variable
        System.out.println("The addition of x = 5 and y = 3 assigned to z is: " + z);

    }
}
