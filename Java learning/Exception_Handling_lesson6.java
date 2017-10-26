

//Arithmetic Exception
//Class Not Found Exception
//Illegal Argument Exception
//Index Out of Bounds Exceptions
//Input mismatch Exception
//IOException


//Exceptions are a fancy way to guess what is wrong with code and pinpoint certain areas in code where problems may exsist



import java.util.Scanner;
import java.util.InputMismatchException;

public class Exception_Handling_lesson6 {

	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		System.out.println("How old are you?");
		int age = checkValidAge();
		
		
		if (age != 0)
		{
			System.out.println("You are " + age + " years old");
		}
		
		
		
		divideByZero(2);
		
		
	}
	public static int checkValidAge()
	{
		try
		{
			return userInput.nextInt();
		}
		catch (InputMismatchException e)
		{
			userInput.next();  //disregards previous inputs
			System.out.println("That isn't a whole number");
			return 0;
		}
	}
	public static void divideByZero(int a)
	{
		
		try
		{	
			System.out.println(a/0);	
		}
		catch (ArithmeticException e)
		{
			System.out.println("You can't do that");
			
			System.out.println(e.getMessage());
			
			System.out.println(e.toString());
			
			
		}
		
	}
	
	
}
