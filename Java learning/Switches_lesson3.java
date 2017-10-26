
public class Switches_lesson3 {

	public static void main(String[] args)
	{
		int randomNumber = (int)(Math.random()*50);
		
		if ( randomNumber < 25)
		{
			System.out.println("The random number is less than 25");
		}
		else
		{
			System.out.println("The random number is greater than 25");
		}
		System.out.println("The random number is " + randomNumber);
		
		//  | = or conditional
		//  & = and conditional
		
		int valueOne = 1;
		int valueTwo = 2;
		
		
		
		int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;
		
		System.out.println(biggestValue);
		
		
		// SWITCH STATEMENT
		
		char theGrade = 'G';
		
		switch(theGrade)
		{
		case 'A':
			System.out.println("Great Job");
			break;
		case 'B':
			System.out.println("Good Job");	
			break;
		case 'C':
			System.out.println("Average Job");
			break;
		case 'D':
			System.out.println("Shit Job");
			break;
		default:
			System.out.println("Failed Job");
			break;
			
			
		}
		
		
		
	}
	
	
}
