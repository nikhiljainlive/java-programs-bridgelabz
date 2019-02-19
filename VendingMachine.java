package functionalprograms;

// class declaration for change returned by Vending Machine program
public class VendingMachine 
{
	// displays the fewest notes returned
	public static void fewNotes()
	{
		try
		{
			int change = Utility.input("enter amount to change: ");
			if(change > 0)
			{
				int[] notes = new int[] {1, 2, 5, 10, 50, 100, 500, 1000};
				
				calculateChange(change, notes);		
			}
			else
			{
				System.out.println("amount should be greater than zero.. try again");
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("invalid input.. only numbers are allowed");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	// calculates the fewest notes
	public static void calculateChange(int change, int[] notes)
	{
		int i = notes.length-1;
		int count = 0;
		while(change != 0 && i >= 0)
		{
			if(change >= notes[i])
			{	++count;
				change = change - notes[i];
			}
			else
			{	
				System.out.println("change: " + notes[i] + " (" + count + ")");
				count = 0;
				i--;
				
			}
		}
		System.out.println("change: " + notes[i] + " (" + count + ")");
	}
}
