package classes.attributes;

public class MultipleObjects {

    public static void main(String[] args) {
        MainAttributes myObj1 = new MainAttributes();  // Object 1
        MainAttributes myObj2 = new MainAttributes();  // Object 2

        myObj2.x = 25;

        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}
