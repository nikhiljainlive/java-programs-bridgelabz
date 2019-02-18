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
			int[] a = new int[arrLength];
			
			Utility.readArray(a, arrLength);								// reads array
			int startT = (int) System.nanoTime();
			Utility.insertionSortInt(a);											// sorts array
			System.out.println(Utility.stopWatchTimer(startT));				// displays stop-watch timer
			
			int key = Utility.input("enter element to search: ");
			Utility.binarySearchInt(a, key);								// binary search
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input.. Try again!");				// handles exceptions
			sortNumbers();
		}
	}
}
