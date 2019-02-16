package functionalprograms;

public class EntryPoint 
{
	public static void main(String[] args)
	{
		boolean value = true;
		
		System.out.println("===============================================================================================");
		System.out.println("------Main Menu------");
		System.out.println("Choose from the following:");
		System.out.println("1. Functional Programs");
		System.out.println("2. Algorithm Programs");
		System.out.println("enter 0 to exit");
		System.out.println("===============================================================================================");
		
		while(value) 
		{
			try
			{
				switch(Utility.input("\nenter your choice: "))
				{
				
					case 0: value = false;
							break;
							
				 	case 1: FuncProgramList.programList();
				 			break;
				 			
				 	case 2: AlgoProgramsList.programList();
			 				break;
			 				
				 	default: System.out.println("Invalid Option! Try Again...");
				}
			}
			catch(Exception e)
			{
				System.out.println("Invalid Command.. Try again!\n");
				main(null);
			}
		}
	}
	
	public static void stringComp()
	{
		int length = Utility.input("how many strings you want to enter: ");
		String[] str = new String[length];
		
		for(int i = 0; i < length; i++)
		{
			str[i] = Utility.stringInput("enter word (" + (i+1) + ") :");
		}
		String key = Utility.stringInput("enter word to search for: ");
		Utility.binarySearchString(str, key);
	}
}
