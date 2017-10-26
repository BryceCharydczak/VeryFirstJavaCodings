import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class ArrayLists_Lesson11 {

	public static void main(String[] args)
	{
		ArrayList arraylist1;
		ArrayList arraylist2 = new ArrayList();
		
		ArrayList names = new ArrayList<String>();
		
		names.add("myboy");
		names.add("is");
		names.add("ANTHONY NGUYEN");
		names.add(2, "Austin cook and");
		
		for (int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		
		names.set(0, "my boy");
		names.remove(1);
		
		ArrayList nameCopy = new ArrayList();
		ArrayList nameBackup = new ArrayList();
		
		nameCopy.addAll(names);
		//IMPORTANT METHOD TO BACKING UP PREVIOUS DATA.
		
		String paulYoung = "Paul young";
		
		names.add(paulYoung);
		if(names.contains(paulYoung))
		{
			System.out.println("Paul is here");
		}
		
		if(names.containsAll(nameCopy))
		{
			System.out.println("Everything in nameCopy is in names");
		}
		
		names.clear();
		if(names.isEmpty())
		{
			System.out.println("ArrayList is Empty");
		}
		
		Object[] moreNames = new Object[4];
		moreNames = nameCopy.toArray();
		System.out.println(Arrays.toString(moreNames));
		
	}
}
