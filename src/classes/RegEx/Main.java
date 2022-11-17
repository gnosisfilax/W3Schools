package classes.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Chang", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Guillermo Chang");
        boolean matchFound = matcher.find();

        if (matchFound) {
            System.out.println("Match found!");
        } else {
            System.out.println("Match not found");
        }
    }
}

/*
In this example, The word "Chang"
First, the pattern is created using the Pattern.compile() method.
The first parameter indicates which pattern is being searched for and the second parameter has a flag to indicates that the search should be case-insensitive.
The second parameter is optional.

The matcher() method is used to search for the pattern in a string.
It returns a Matcher object which contains information about the search that was performed.

The find() method returns true if the pattern was found in the string and false if it was not found.

*/



