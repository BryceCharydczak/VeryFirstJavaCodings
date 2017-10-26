public class Helloworld {
	
	static String rndmString = "Swiggity Swooty";
	
	static final double rndmNum = 3.1495;
	
	public static void main(String args[]){
		
		
		System.out.println(rndmNum);
		
		int integerOne = 22;
		
		int integerTwo = 12;
		
		byte bigByte = 127;
		short bigShort = 32767;
		int bigInt = 2100000000;
		long bigLong = 9220000000000000000L;
		float bigFloat = 3.14F;
		double bigDouble = 3.14239487234923;
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		boolean trueOrFalse = true;
		
		char randomChar = 65;
		char anotherChar = 'A';
		
		System.out.println(randomChar + anotherChar);
		
		char escapedChars = '\f';
				
		String stringOne = "Hello";
		String stringTwo = "Goodbye";
		
		System.out.println(stringOne +" "+ "and"+" " + stringTwo);
		
		//TO STRING METHODS
		
		String byteString = Byte.toString(bigByte);
		String shortString = Short.toString(bigShort);
		String intString = Integer.toString(bigInt);
		String longString = Long.toString(bigLong);
		String floatstring = Float.toString(bigFloat);
		String doublestring = Double.toString(bigDouble);
		
		int stringToInt = Integer.parseInt(intString);
		
		// parseString, parseShort, parseLong, parseFloat, etc.
		
		System.out.println(stringToInt);
		
		
		//CASTING
		
		double aDoubleValue = 3.145;
		int doubleInt = (int) aDoubleValue;
		
		
		
		System.out.println(integerTwo);
		
	}
}
