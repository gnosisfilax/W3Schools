package basics.operators;
/*
Bitwise operator works on bits and performs bit-by-bit operation.
If a = 60 and b = 13; now in binary format they will be as follows:
	x = 0011 1100
	y = 0000 1101
 */
public class BitwiseOperators {

	public static void main(String[] args) {
				
		int x = 60, y = 13;
		
		x &= y;
		System.out.println("Binary AND Operator copies a bit to the reesult if it exists in both operands: " + x); //Will give 12 "0000 1100"
		
		x = 60; y = 13;
		x |= y;
		System.out.println("Binary OR Operator copies a bit if it exists in either operand: " + x); //Will give 61 "0011 1101" 
				
		x = 60; y = 13;
		x ^= y;
		System.out.println("Binary XOR Operator copies the bit if is set in one operand but not both: " + x); //Will give 49 "0011 0001" 
				
		x = 60; y = 2;
		x <<= y;
		System.out.println("The left operands value is moved left by the number of bits specified by the right operand: " + x); //A << 2 will give 240 which is 1111 0000
		
		x = 60; y = 2;
		x >>= y;
		System.out.println("The left operands value is moved right by the number of bits specified by the right operand: " + x); //A >> 2 will give 15 which is 1111
	
	}

}
