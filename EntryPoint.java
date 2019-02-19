package functionalprograms;

// class declaration of main method
public class EntryPoint 
{
	// Main method to switch to programs List
	public static void main(String[] args)
	{
		boolean value = true;
		programList();
		
		while(value) 
		{
			try
			{
				switch(Utility.input("\nenter your choice(main menu): "))
				{
					case 0: return;
						
				 	case 1: FuncProgramList.programList();							// method to perform Functional program list
				 			break;
				 			
				 	case 2: AlgoProgramsList.programList();							// method to perform Algorithm program list
			 				break;
			 				
				 	default: System.out.println("Invalid Option! Try Again...");
				}
			}
			catch(NumberFormatException e)											// if input is other than integer
			{
				System.out.println("Invalid Command.. Try again!\n");
				main(null);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());									// handles other exceptions
			}
		}
	}
	
	// displays menu of programs
	public static void programList()
	{
		System.out.println("\n===============================================================================================");
		System.out.println("------Main Menu------");
		System.out.println("Choose from the following:");
		System.out.println("1. Functional Programs");
		System.out.println("2. Algorithm Programs");
		System.out.println("\n(enter 0 to exit)");
		System.out.println("===============================================================================================");
	}
	
	// test for binary search algorithm for string
	public static void stringCompare()
	{
		try 
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
		catch(NumberFormatException e)
		{
			System.out.println("invalid input allowed.. try again");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
