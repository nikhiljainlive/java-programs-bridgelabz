package functionalprograms;

public class FlipCoin 
{
	public static void flipCoin()  // calculates the percentage of heads and tails in flipping coin
	{
		try 
		{
			int nooftimes = Utility.input("Enter the no. of times to flip coin: ");
			int heads = 0, tails = 0;
				
			if(Utility.isLessthan(nooftimes, 0))
			{
				System.out.println("entered number should not be negative");
			}
			else
			{
				for (int i = 1; i <= nooftimes; i++)
				{
					double random = Utility.randomnum();
					if (random < 0.5)
					{
						 heads++;
					}
					else
					{
						tails++;
					}
				}
				System.out.println("Heads: " + Utility.percent(heads, nooftimes) + "%");
				System.out.println("Tails: " + Utility.percent(tails, nooftimes) + "%");
			}
		}
		catch(Exception e)
		{
			System.out.println("Incorrect Input... Try Again!");
			flipCoin();
		}
	}
}
