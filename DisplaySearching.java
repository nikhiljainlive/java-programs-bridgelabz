package functionalprograms;

// class declaration of displaying searching and sorting for integers and strings		
public class DisplaySearching
{		
	// main method to display
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Select the operations on");
			System.out.println("1. Searching & Sorting on Integers");
			System.out.println("2. Searching & Sorting on Strings");
			
			int ch = Utility.input("choose option: ");
			
			switch(ch)
			{
				
				case 1:	IntegerSearchNSort.operateInt();			// searching and sorting for integers
						break;
						
				case 2: StringSearchnSort.operateString();			// searching and sorting for strings
						break;
						
				default: System.out.println("invalid selection.. try again");
			
			}	
		}
		catch(NumberFormatException e)								//	if user input is other than integer
		{
			System.out.println("invalid input.. try again");
		}
		catch(Exception e)											// handles other exceptions
		{
			System.out.println(e.getMessage());
		}
	}
	
	// calculates elapsed time in nanoseconds
	public static int elapsedTime(int startTime)
	{
		int stopTime = (int) System.nanoTime();
		int elapsedTime = (stopTime - startTime);
		
		return elapsedTime;
	}
	
	// class declaration for Integer Sorting and searching operations
	public static class IntegerSearchNSort
	{	
		// size of array
		public static int length = Utility.input("enter number of elements: ");
		// creating integer array
		public static int[] intArray = new int[length];
		
		// displaying elements of integer array
		public static void displayArray()
		{
			System.out.println("The entered array is : ");
			for(int i = 0; i < intArray.length; i++)
			{
				System.out.print(intArray[i] + " ");
			}
			System.out.println();
		}
		
		// displays bubble sort, insertion sort and binary search operations
		public static void operateInt()
		{
			try 
			{
				Utility.readIntArray(intArray, length);								// reads integer array
				int temp[] = intArray;
				displayArray();
				
				int startTime1 = (int) System.nanoTime();
				Utility.insertionSortInt(intArray);
				int timeInsertion = elapsedTime(startTime1);
				System.out.println("Elapsed Time: " + timeInsertion + " ns");		// showing elapsed time for insertion sort
				
				int startTime2 = (int) System.nanoTime();
				Utility.bubbleSortInt(temp);
				int timeBubble = elapsedTime(startTime2);
				System.out.println("Elapsed Time: " + timeBubble + " ns");			// showing elapsed time for bubble sort
				
				if(timeInsertion > timeBubble)
				{
					System.out.println("Insertion Sort > Bubble Sort");				// comparing elapsed time of both sorting algorithms
				}
				else
				{
					System.out.println("Bubble Sort > Insertion Sort");
				}
				
				int key = Utility.input("enter element to find: ");
				Utility.binarySearchInt(intArray, key);	
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
	
	// class declaration for searching and sorting operations on strings
	public static class StringSearchnSort
	{
		// size of string array
		public static int length = Utility.input("enter number of elements: ");
		//creating string array
		public static String[] strArray = new String[length];
		
		// displays searching and sorting opereations on strings
		public static void operateString()
		{
			try 
			{
				Utility.readStringArray(strArray, length);							// reads array of strings
				
				String temp[] = strArray;
				displayArray();
				
				int startTime1 = (int) System.nanoTime();							
				Utility.insertionSortString(strArray);
				int timeInsertion = elapsedTime(startTime1);
				System.out.println("Elapsed Time: " + timeInsertion + " ns");		// showing elapsed time for insertion sort
				
				int startTime2 = (int) System.nanoTime();
				Utility.bubbleSortString(temp);
				int timeBubble = elapsedTime(startTime2);
				System.out.println("Elapsed Time: " + timeBubble + " ns");			// showing elapsed time for bubble sort
				
				if(timeInsertion > timeBubble)										// comparing elapsed time of both sorting algorithms
				{
					System.out.println("Insertion Sort > Bubble Sort");
				}
				else
				{
					System.out.println("Bubble Sort > Insertion Sort");
				}
				
				String key = Utility.stringInput("enter string to find: ");
				Utility.binarySearchString(strArray, key);	
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		// displays the elements of string array
		public static void displayArray()
		{
			System.out.println("The entered array is : ");
			for(int i = 0; i < strArray.length; i++)
			{
				System.out.print(strArray[i] + " ");
			}
			System.out.println();
		}
	}
}	

