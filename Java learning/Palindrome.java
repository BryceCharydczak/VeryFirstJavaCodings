import java.util.Scanner;

public class Palindrome {
	
	
	public static void main(String[] args)
	{
	Scanner userInput = new Scanner(System.in);
	System.out.println("Please enter a string that only contains digits (0-9) and letters (a-z): ");
	String palindrome;
	palindrome = userInput.nextLine();
	
	int test = testPal(palindrome);
	if ( test == 1 )
	{
		System.out.println(palindrome + "is a palindrome");
	} else {
		System.out.println(palindrome + "is not a palindrome, please try again");
	}
	
	}
	
	
	public static int testPal(String palindrome)
	{
		
		if ((palindrome.length() % 2) == 1)
		{
			int i = 0;
			int negI = -1;
			
			for (i = 0; i < (palindrome.length()/2); i++)
			{
				negI--;
				
				if (!(palindrome.charAt(i)).equals(palindrome.charAt(negI)))
				{
					return 0;
				}
				
				
			}

			return 1;
		} else {
			int i = 0;
			int negI = -1;
			
			for (i = 0; i < (palindrome.length()/2); i++)
			{
				negI--;
				
				if (!(palindrome.charAt(i)).equals(palindrome.charAt(negI)))
				{
					return 0;
				}

			}
			return 1;
		
		}
	}
}