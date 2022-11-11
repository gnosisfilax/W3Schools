package basics.strings;

public class Strings {

	public static void main(String[] args) {
		
		String greeting = "Hello";
		System.out.println(greeting + " Guillermo");
		
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());
		
		txt = "Hello World";
		System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txt.toLowerCase());   // Outputs "hello world"
		
		txt = "Please locate where 'locate' occurs!";
		System.out.println(txt.indexOf("locate")); // Outputs 7
		
		String firstName = "Guillermo";
		String lastName = "Chang";
		System.out.println(firstName + " " + lastName);
		
		firstName = "Guillermo ";
		lastName = "Chang";
		System.out.println(firstName.concat(lastName));
		
		String x = "10";
		int y = 20;
		x += y;   // z will be 1020 (a String)
		System.out.println(x);

	}

}
