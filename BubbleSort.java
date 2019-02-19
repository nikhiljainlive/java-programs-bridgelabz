package functionalprograms;

// Class Declaration for Bubble Sort
public class BubbleSort
{
	// displays sorted array
	public static void sortNumbers()
	{
		try 
		{
			int arrLength = Utility.input("enter no. of elements: ");
			if( arrLength > 0)
			{
				int[] a = new int[arrLength];
			
				Utility.readIntArray(a, arrLength);								// reads array elements
				Utility.bubbleSortInt(a);										// sorts array elements
			}
			else
			{
				System.out.println("size of array should be greater than 0");
			}
		}
		catch(NumberFormatException e)											// if user inputs other than integer
		{
			System.out.println("numeric input expected.. try again");
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input.. Try again!");					// handles exceptions
			sortNumbers();
		}
	}
}
