/*package Programs;

public class PermutationString
{
	public static void permute()
	{
		String s = Utility.stringInput("enter string: ");
		permuteHelper(s, "");
	}
	
	public static void permuteHelper(String s, String chosen)
	{
		if(s.isEmpty())
		{
			System.out.println(chosen);
		}
		else
		{
			//choose/explore/un-choose
			char[] charA = s.toCharArray();  //StringtoArray
			
			for(int i = 0; i < charA.length; i++)
			{
				char c = charA[i];				//choose
				chosen += c;
				s = s.substring(i+1);
								
				permuteHelper(s, chosen);		//explore
	
				s = s.substring(i) + c;
				chosen = chosen.substring(0, chosen.length()-1);
			}
		}
	}

}
*/