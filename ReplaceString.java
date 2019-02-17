package functionalprograms;

// Class declaration for replacing string
public class ReplaceString 
{
	// prints hello message with user-name
	public static void replaceString()
	{
		try 
		{
			String username = Utility.stringInput("Enter your Username: ");					// taking input using input method of utility class
			
			if(Utility.isString(username) == true)											// validates the string if contains digits or white-spaces
			{
				if(username.length() >= 3)													// prints message if user-name is greater than 3 characters
				{
					System.out.println("Hello " + username + ", How are you?\n");
				}
				else
				{
					System.out.println("ensure your Username has min 3 characters\n");
				}//end of inner if-else
			}
			else
			{
				System.out.println("(entered username should be in correct format)");
				replaceString();
			}//end of outer if-else
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());						// handles exceptions
		}
	}
}
