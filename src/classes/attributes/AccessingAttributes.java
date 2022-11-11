package classes.attributes;

public class AccessingAttributes {
    public static void main(String[] args) {
        MainAttributes myObj = new MainAttributes();
        MainAttributes myObj2 = new MainAttributes();

        System.out.println(myObj.x);
        System.out.println(myObj2.y);

        //We can also modify or override attributes values.
        myObj.x = 40;
        myObj2.y = 45;

        System.out.println(myObj.x);
        System.out.println(myObj2.y);

    }
}
