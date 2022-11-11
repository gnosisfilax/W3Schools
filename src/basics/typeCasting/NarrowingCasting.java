package basics.typeCasting;

public class NarrowingCasting {

	public static void main(String[] args) {
		//Narrowing Casting (manually) - converting a larger type to a smaller size type
		//double -> float -> long -> int -> char -> short -> byte
		
		double myDouble = 9.78d;
		int myInt = (int) myDouble; //Manual casting
		
		System.out.println(myDouble);
		System.out.println(myInt);

	}

}
