package functionalprograms;

// class declaration for FlipCoin program
public class FlipCoin 
{
	// calculates the percentage of heads and tails in flipping a coin
	public static void flipCoin()
	{
		try 
		{
			int noOfTimes = Utility.input("Enter the no. of times to flip coin: ");
			int heads = 0, tails = 0;
				
			if(Utility.isLessthan(noOfTimes, 0))
			{
				System.out.println("(only positive integers are allowed...try again)");
				flipCoin();
			}
			else
			{
				for (int i = 1; i <= noOfTimes; i++)
				{
					double random = Utility.randomnum();
					if (random < 0.5)
					{
						 heads++;
					}
					else
					{
						tails++;
					}//end of inner if-else block
				}
				
				System.out.println("Heads: " + Utility.percent(heads, noOfTimes) + "%");
				System.out.println("Tails: " + Utility.percent(tails, noOfTimes) + "%");
			}//end of outer if-else block
		}
		catch(NumberFormatException e)												// if user-input is other than integer 
		{
			System.out.println("(only numbers are allowed.. try again)");
			flipCoin();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());										// handles other exceptions
		}
	}
}
