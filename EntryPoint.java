package functionalprograms;

// class declaration of main method
public class EntryPoint 
{
	// Main method
	// calls method of FunctionprogramList and AlgoprogramList
	public static void main(String[] args)
	{
		boolean value = true;
		
		System.out.println("\n===============================================================================================");
		System.out.println("------Main Menu------");
		System.out.println("Choose from the following:");
		System.out.println("1. Functional Programs");
		System.out.println("2. Algorithm Programs");
		System.out.println("===============================================================================================");
		
		while(value) 
		{
			try
			{
				switch(Utility.input("\nenter your choice(main menu): "))
				{
							
				 	case 1: FuncProgramList.programList();
				 			break;
				 			
				 	case 2: AlgoProgramsList.programList();
			 				break;
			 				
				 	default: System.out.println("Invalid Option! Try Again...");
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("Invalid Command.. Try again!\n");
				main(null);
			}
		}
	}
	
	// test for binary search algorithm for string
	public static void stringComp()
	{
		int length = Utility.input("how many strings you want to enter: ");
		String[] str = new String[length];
		
		for(int i = 0; i < length; i++)
		{
			str[i] = Utility.stringInput("enter word (" + (i+1) + ") :");
		}
		Utility.insertionSortString(str);
		String key = Utility.stringInput("enter word to search for: ");
		Utility.binarySearchString(str, key);
	}
}
