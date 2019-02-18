package functionalprograms;

public class SortnSearch
{
	public static void main(String[] args)
	{
		System.out.println("Select the operations on");
		System.out.println("1. Searching & Sorting on Integers");
		System.out.println("1. Searching & Sorting on Strings");
		
		int ch = Utility.input("choose option: ");
		
		switch(ch)
		{
			
			case 1:	operateInt();
					break;
					
			case 2: 
					break;
					
			default: System.out.println("invalid selection.. try again");
		
		}
	}
	
	public static int[] createArray()
	{
		//int length = Utility.input("enter number of elements: ");
		int[] intArray = new int[10];
		Utility.readArray(intArray, 10);
		
		return intArray;
	}
	
	public static void displayArray()
	{
		int[] a = SortnSearch.createArray();
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
	
	public static void operateInt()
	{
		displayArray();
		Utility.insertionSortInt(createArray());
		System.out.println("\n\n");
		displayArray();
		Utility.bubbleSortInt(createArray());
			
	}
	
	//public static void operateString()
	//{
		
	//}
}
