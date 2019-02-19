package functionalprograms;

// class declaration of insertion sort of strings
public class InsertionSortString 
{
	// displays sorted string by insertion sort algorithm
	public static void sortedString()
{
		try 
		{
			int length = Utility.input("number of elements you want to enter: ");
			if(length > 0)
			{
				String[] strArray = new String[length];
				Utility.readStringArray(strArray, length);						// reads array of strings
				Utility.insertionSortString(strArray);							// insertion sort method of utility class	
			}
			else
			{
				System.out.println("number of elements cannot be zero or less than zero..");
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("only number input is allowed.. try again");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
