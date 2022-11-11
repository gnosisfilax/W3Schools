package basics.strings;

public class SpecialCharacters {
	public static void main(String[] args) {
		
		//The sequence \"  inserts a double quote in a string:
		String txt = "We are the so-called \"Vikings\" from the north.";
		System.out.println(txt);
		
		//The sequence \'  inserts a single quote in a string:
	    txt = "It\'s alright.";
	    System.out.println(txt);
	    
	    //The sequence \\  inserts a single backslash in a string:
	    txt = "The character \\ is called backslash.";
	    System.out.println(txt);
	    
	    txt = "Hello\nWorld!";//New Line
	    System.out.println(txt);
	    
	    txt = "Hello\rWorld!";//Carriage Return
	    System.out.println(txt);
	    
	    txt = "Hello\tWorld!";//Tab
	    System.out.println(txt);

	}

}
