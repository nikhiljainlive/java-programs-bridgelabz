package functionalprograms;

/**
 * @purpose class declaration of main method
 * @author Nikhil jain
 * @version 1.0
 */
public class EntryPoint 
{
	/**
	 * @purpose Main method to switch to programs List
	 * @param args
	 * @return void
	 */
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
					case 0: return;													// exits the method
						
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
	
	// 
	/**
	 * @purpose displays menu of programs
	 * @param void
	 * @return void 
	 */
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
}
