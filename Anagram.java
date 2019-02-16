package functionalprograms;

public class Anagram
{
	public static void findAnagram()
	{
		String string1 = Utility.stringInput("enter string 1: ");
		String string2 = Utility.stringInput("enter string 2: ");
		
		boolean value = Utility.isAnagram(string1, string2);
		
		if(value == true)
		{
			System.out.println("Entered strings are Anagrams");
		}
		else
		{
			System.out.println("Entered strings are not Anagrams");
		}
	}
}
