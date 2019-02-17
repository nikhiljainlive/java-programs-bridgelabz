package functionalprograms;

public class Harmonicnum
{
	public static void findHarmonicNum()
	{
		try
		{
			int num = Utility.input("Enter N: ");
			double harmonicnum = 0;
			
			if(Utility.isLessthan(num, 1) == false)
			{
				for(int i = 1; i <= num; i++)
				{
					harmonicnum = (1.0 / i) + harmonicnum;
				}
				
				System.out.println(harmonicnum);
			}
			else
			{
				System.out.println("(entered number should be greater than 0)");
				findHarmonicNum();
			}
		}
		catch(NumberFormatException e)												// if user-input is other than integer 
		{
			System.out.println("(characters are not allowed.. try again)");
			findHarmonicNum();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());										// handles other exceptions
		}
	}
	
}
