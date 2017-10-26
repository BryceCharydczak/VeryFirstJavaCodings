import java.util.Scanner;

public class Acquire_a_dank_meme {

	
	static Scanner Guess = new Scanner(System.in);
	public static void main(String [] args)
	{

		int golden_Pepe = 0;
		int foreverAlone = 1;
		int FEELSGOODMAN = 2;
		int itsLitFam = 3;
		int bush_did_Harambe = 4;
		int deleteSystem32YouKuk = 5;
		
		String[] memeString = {"Golden Pepe","Forever Alone","FEELSGOODMAN",
				"It's LIT fam", "Bush did Harambe 2k16",
				"Delete System 32 You Kuk"};
		
		
		int memeGranted = -1;
		int memeHold = 0;
		
		
		while (memeGranted != 1)
		{
			System.out.println("Guess a number from 0 - 5: ");
			memeHold = Guess.nextInt();
			memeGranted = tryHardGuess(memeHold); 
			if (memeGranted == 6)
			{
				System.out.println("Try again");
			}
		}
		
		System.out.println("You acquired the dankest meme: " + memeString[memeHold]);
		
	}

	public static int spawnJuicyMeme()
	{
		
		int juicyMeme = (int)(Math.random()*6);
		
		return juicyMeme;
	}
	
	public static int tryHardGuess(int guess)
	{
		int juicyMeme = 0;
		if (guess == juicyMeme)
		{
			return 1;
		}
		else
		{
			return 6;
		}

	}

	
}
