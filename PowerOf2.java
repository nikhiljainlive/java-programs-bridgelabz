package functionalprograms;

public class PowerOf2   //class declaration
{
	public static void findPowerOfTwo()  		//calculates power of 2
	{
		try
		{
			int n = Utility.input("Enter N: ");
	
			if(n >= 0 && n < 31)
			{

				for(int i = 0; i <= n; i++)
				{
					int res = (int) Math.pow(2, i);
					System.out.println("2 ^ " + i + " = " + res);
				}
				
				System.out.println("");
			}
			else
			{
				System.out.println("value should be less than 31 and greater than zero");
				findPowerOfTwo();
			}
		}
		catch(Exception e)
		{
			System.out.println("Incorrect Input... Try Again!");
			findPowerOfTwo();
		}
	}
}
