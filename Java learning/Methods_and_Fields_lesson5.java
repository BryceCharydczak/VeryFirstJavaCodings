import java.util.Scanner;

public class Methods_and_Fields_lesson5 {

	
	
	static int randomNum;
	static double myPi = 3.14159; // Class Variable
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args)
	{
		
		System.out.println(randomNum);
		
		int guessResult = 1;
		int randomGuess = 0;
		
		while (guessResult != -1)
		{
			
			System.out.println("Guess a random number between 0 - 50: ");
			randomGuess = userInput.nextInt();
			guessResult = checkGuess(randomGuess);
		}
		
		System.out.println("Yess the random number is " + randomGuess);
		
		System.out.println(addThem(1,2));
		
		int d = 5;
		
	}
	
	
	public static void tryToChange(int d)
	{
		d = d + 1;
		System.out.println("tryToChange d = " + d);
	}
	
	
	public static int getRandomNum()
	{
		
		randomNum = (int)(Math.random()*51);
		return randomNum;
		
	}
	public static int checkGuess(int guess)
	{
		if ( guess == randomNum)
		{
			return -1;
		}
		else
		{
			return guess;
		}
	}
	
	public static int addThem(int a, int b)
	{
		
		double smallPi = 3.140; // Local Variable
		
		System.out.println("Global " + myPi);
		
		return 1;
		
	}
}
