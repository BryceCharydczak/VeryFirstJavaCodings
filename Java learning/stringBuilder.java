import java.util.Arrays;


public class stringBuilder {
	public static void main(String [] args){
		
		String randomString = "I'm just a randomstring";
		
		String gotToQuote = "He said, \"I'm here\"";
		
		int numTwo = 2;
		
		System.out.println(randomString + " " + gotToQuote);
		
		String uppercaseStr = "BIG";
		String lowercaseStr = "big";
		
		if (uppercaseStr.equals(lowercaseStr)){
			System.out.println("They're equal");
		} else if (uppercaseStr.equalsIgnoreCase(lowercaseStr)){
			System.out.println("ignoring case is equal");
		}
		
		System.out.println("Print e from gotToQuote: " + " " + gotToQuote.charAt(1));
		System.out.println(lowercaseStr.compareTo(uppercaseStr));
		System.out.println(randomString.compareTo(uppercaseStr));
	
		System.out.println(lowercaseStr.contains("b"));	
		// contains method, case sensitive boolean output
		
		System.out.println(uppercaseStr.endsWith("g"));	
		// endsWith, case sensitive, boolean output
		
		System.out.println(uppercaseStr.indexOf("i"));
		// indexOf method, prints index marking the beginning of input string
		
		System.out.println("length: " + uppercaseStr.length());
		
		
		System.out.println(uppercaseStr.replace("i", "I"));	
		
		
		String[] letterArray = uppercaseStr.split("");
		/*
		 * bringing the original string into an array
		 * separating each string in the array by the ""
		 * 
		*/
		
		System.out.println(Arrays.toString(letterArray));
		
		int lengthLetterArray = letterArray.length;
		System.out.println(lengthLetterArray);	
	}
}
