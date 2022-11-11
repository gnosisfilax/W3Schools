package basics.dataTypes;

public class Numbers {

	public static void main(String[] args) {
		
		byte myNum = 100;//The value will be within -128 and 127
		short myNum2 = 5000;//The short data type can store whole numbers from -32768 to 32767
		int myNum3 = 100000;//The int data type can store whole numbers from -2147483648 to 2147483647
		long myNum4 = 15000000000L;//The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807		
		float myFloat = 5.75f;//The float data type can store fractional numbers from 3.4e−038 to 3.4e+038 
		double myDouble= 19.99;//The double data type can store fractional numbers from 1.7e−308 to 1.7e+308
		//A floating point number can also be a scientific number with an "e" to indicate the power of 10
		float f1 = 35e3f;
		double d1 = 12e4d;
		
		System.out.println(myNum);
		System.out.println(myNum2);
		System.out.println(myNum3);
		System.out.println(myNum4);
		System.out.println(myFloat);
		System.out.println(myDouble);
		System.out.println(f1);
		System.out.println(d1);

	}

}
