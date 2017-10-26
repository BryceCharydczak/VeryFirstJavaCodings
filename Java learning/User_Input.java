import java.util.Scanner;
// import java.util.*;    for all your miscellaneous pleb needs

public class User_Input {

	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.print("Your favorite number: ");
		
		if(userInput.hasNextInt())
		{
			int numberEntered = userInput.nextInt();
			
// nextLine, nextDouble, nextFloat
			
			System.out.println("You entered "+ numberEntered);
			
			int numEnteredTimes2 = numberEntered + numberEntered;
			System.out.println(numberEntered + "+" + numberEntered + "=" + numEnteredTimes2);
			
			int numEnteredMinus2 = numberEntered - 2;
			System.out.println(numberEntered + "-2" + "= " + numEnteredMinus2);
			
			int numEnteredTimesItself = numberEntered * numberEntered;
			System.out.println(numberEntered + "*" + numberEntered + "= " + numEnteredTimesItself);

			int numEnteredDividedBy2 = numberEntered / 2;
			System.out.println(numberEntered + "/" + "2= " + numEnteredDividedBy2);
			
			int numEnteredModulo2 = numberEntered % 2;
			System.out.println(numberEntered + "%" + "2=" + numEnteredModulo2);
			
			//DECREMENT OR INCREMENT
			//numberEntered--;
			//numberEntered++;
			
			int numberAbsolute = Math.abs(numberEntered);
			int whichIsBigger = Math.max(5, 6);
			int whichIsBigger2 = Math.min(5, 6);
			
			double numSqrt = Math.sqrt(5.34);
			
			int numCeiling = (int)Math.ceil(5.34);
			int numFloor = (int)Math.floor(5.34);
			int numRound = (int)Math.round(5.34);
			int randomNumber = (int) (Math.random()* 11);
			System.out.println("Random Number " + randomNumber);
		}
		else
		{
			System.out.println("Enter an integer next time please");
		}
	}
}
