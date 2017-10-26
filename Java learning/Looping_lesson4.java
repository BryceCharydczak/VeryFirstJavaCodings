import java.util.Scanner;
public class Looping_lesson4 {

	
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		String contYorN = "Y";
		
		int h = 1;
		
		while(contYorN.equalsIgnoreCase("y"))
		{
			System.out.println(h);
			System.out.println("Continue, y or n? ");
			contYorN = userInput.nextLine();
			h++;
		}
		
		System.out.println("you said N");
		
		int i = 1;
		
		while (i <= 20)
		{
			
			if(i == 3)
			{
				i+=2;
				continue;
			}
			
			System.out.println(i);
			i++;
			
			if((i%2)==0);
			{
				i++;
			}
			
		}
		
		
		double myPi = 4;
		
		double denom = 3;
		
		
		
		while(denom < 11)
		{
			myPi = myPi - (4/denom) + (4/(denom + 2));
			denom += 4;
			System.out.println(myPi);
		}
		System.out.println("The real value of Pi = " + Math.PI);
		
		
		for ( int l = 10; l < 20; l++)
		{
			System.out.println(l);
			
		}
		
		int m, n;
		for (m = 1, n = 2; m<10; m+=2, n+= 2)
		{
			System.out.println(m + "\n" + n);
		}
		
		
	}
	
	
	
	
}
