package classes.wrapper;

public class Main {
    public static void main(String[] args) {
        Integer myInt = 100;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);
        /*
        Since you're now working with objects, you can use certain methods to get information about the specific object.

For example, the following methods are used to get the value associated with the corresponding wrapper object:
intValue(), byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue().
         */
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        /*
        Another useful method is the toString() method, which is used to convert wrapper objects to strings.
        */
        String myString = myInt.toString();
        System.out.println(myString.length());
    }
}
/*
Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList,
where primitive types cannot be used (the list can only store objects):
 */
