package classes.packages;

//import  package.name.class; // Import a single class
//import package.name.*; // Import the whole package

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("username is: " + userName);
    }
}
