package functionalprograms;

/**
 * @purpose Class declaration for replacing string
 * @author Nikhil Jain
 * @version 1.0
 */
public class ReplaceString 
{
	/**
	 * @purpose prints hello message with user-name
	 * @param void
	 * @return void
	 */
	public static void replaceString()
	{
		try 
		{
			String userName = Utility.stringInput("Enter your Username: ");					// taking input using input method of utility class
			
			if(Utility.isString(userName) == true)											// validates the string if contains digits or white-spaces
			{
				if(userName.length() >= 3)													// prints message if user-name is greater than 3 characters
				{
					System.out.println("Hello " + userName + ", How are you?\n");
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
