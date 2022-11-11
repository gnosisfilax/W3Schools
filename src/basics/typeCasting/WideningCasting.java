package basics.typeCasting;

public class WideningCasting {

	public static void main(String[] args) {
		//Widening Casting (automatically) - converting a smaller type to a larger type size
		//byte -> short -> char -> int -> long -> float -> double
		
		int myInt = 9;
		double myDouble = myInt; //Automatic casting
		
		System.out.println(myInt);
		System.out.println(myDouble);
		

	}

}
