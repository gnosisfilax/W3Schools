package basics.variables;

public class Variables {

	public static void main(String[] args) {
		String name = "John";
		final int myNum = 15;
		// myNum = 18;
		//Will generate an error: cannot assign a value to a final variable		
		int myNum2;
		myNum2 =20;
		float myFloatNum = 5.99f;
		char myLetter = 'D';// char only use single '' not ""
		boolean myBool = true;// Boolean have to be write in lowercase
		System.out.println(name);
		System.out.println(myNum);
		System.out.println(myNum2);
		System.out.println(myFloatNum);
		System.out.println(myLetter);
		System.out.println(myBool);		

	}

}
