import java.io.*;

public class File_handling_lesson6 {

	
	
	public static void main(String[] args)
	{
		getAFile("./somestuff.txt");
	}
	
	public static void getAFile(String fileName) 
	{
		try{
		FileInputStream file = new FileInputStream(fileName);
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Sorry can't find that file");
		}
		catch (IOException e)
		{
			System.out.println("Unknown IO Error");
		}
		catch(Exception e)
		{
			System.out.println("Some error occurred");
		}
		finally  //always executes and is meant for clean up duty, exiting database etc..
		{
			System.out.println("");
		}
	}
}
