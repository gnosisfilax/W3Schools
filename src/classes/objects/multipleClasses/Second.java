package classes.objects.multipleClasses;
/*
You can also create an object of a class and access it in another class.
"In the same directory"
This is often used for better organization of classes.
 */
public class Second {
    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}
