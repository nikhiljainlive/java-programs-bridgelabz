package functionalprograms;

/**
 * @purpose class declaration of Anagram program
 * @author Nikhil Jain
 * @version 1.0
 */
public class Anagram
{
	/**
	 * @purpose method for displaying if entered strings are anagrams or not
	 * @param void
	 * @return void
	 */
	public static void findAnagram()
	{
		try
		{
			String string1 = Utility.stringInput("enter string 1: ");
			String string2 = Utility.stringInput("enter string 2: ");
			
			boolean value = Utility.isAnagram(string1, string2);
			
			if(value == true)
			{
				System.out.println("\nEntered strings are Anagrams");
			}
			else
			{
				System.out.println("\nEntered strings are not Anagrams");
			}//end of if-else block	
		}
		catch(Exception e)													// handles exceptions if any
		{
			System.out.println(e.getMessage());
		}
	}
}
