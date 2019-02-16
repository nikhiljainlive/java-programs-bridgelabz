package functionalprograms;

public class ReplaceString 
{
	public static void replaceString()
	{
		try 
		{
			String username = Utility.stringInput("Enter your Username: ");
			
			if(Utility.isString(username) == true)
			{
				if(username.length() >= 3)
				{
					System.out.println("Hello " + username + ", How are you?\n");
				}
				else
				{
					System.out.println("Ensure your Username has min 3 characters\n");
					replaceString();
				}
			}
			else
			{
				System.out.println("entered username should be in correct format");
				replaceString();
			}
		}
		catch(Exception e)
		{
			System.out.println("something went wrong... try again");
			replaceString();
		}
	}
}
