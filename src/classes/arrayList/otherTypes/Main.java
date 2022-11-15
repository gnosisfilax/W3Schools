package classes.arrayList.otherTypes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        System.out.println(myNumbers);
        for ( int i : myNumbers ) {
            System.out.println(i);

        }
    }
}
