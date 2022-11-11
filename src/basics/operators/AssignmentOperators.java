package basics.operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		double x = 9, y = 3;
		x = 6;
		
		System.out.println("The new assign is: "+ x);
		x += y;
		System.out.println("The adittion is: " + x);
		x -= y;
		System.out.println(" The subtraction is: " + x);
		x *= y;
		System.out.println("The multiplication is: " + x);
		x /= y;
		System.out.println("The division is: " + x);
		x %= y;
		System.out.println("The modulus is: " + x);
		
	}

}
