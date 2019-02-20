package functionalprograms;

/**
 * @purpose Class declaration for Gambler Program
 * @author Nikhil Jain
 * @version 1.0
 */
public class Gambler 
{ 
	/**
	 * @purpose asks to enter value of stake from user
	 * @param void
	 * @return void
	 */
	public static void playGambler()
	{
		try
		{
			int stakeValue = Utility.input("enter Stake: ");
			if(Utility.isLessthan(stakeValue, 1) == false)					// executes only if value is 1 or greater than 1
			{
				calculateWins(stakeValue);
			}
			else
			{
				System.out.println("(stake should be greater than zero)");
				playGambler();
			}//end of if-else block
			
		}
		catch(NumberFormatException e)											// if user-input is other than integer
		{
			System.out.println("only integers allowed.. try again!\n");
			playGambler();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());									// handles other exceptions
		}
	}
	
	/**
	 * @purpose calculates wins, percentage of wins and loss
	 * @param stake
	 * @return void
	 */
	public static void calculateWins(int stake)
	{	
		try {
			int goal = Utility.input("enter Goal: ");
			
			if(Utility.isLessthan(goal, 0) == false)					// accepts only if value is 0 or greater than 0
			{
				int wins = 0, loss = 0;
				
				while(stake != 0 && stake != goal)
				{
					if(Utility.randomnum() < 0.5)
					{
						wins++;
						stake++;
					}
					else
					{
						loss++;
						stake--;
					}//end of if-else block 
					
				}//end of while loop
				
				int total = wins + loss, winsper = Utility.percent(wins, total);
				System.out.println("Wins: " + wins);
				System.out.println("Wins: " + winsper + " %");
				System.out.println("Loss: " + (100 - winsper) + " %");
				
				if(stake == goal)
				{
					System.out.println("You Won!");
				}
				else
				{
					System.out.println("You Lose! Better luck next time...");
				}//end of inner if-else
			}
			else
			{
				System.out.println("{goal can not be negative.. Try again!)");
				calculateWins(stake);
			}//end of outer if-else block
		}
		catch(NumberFormatException e)											// if user-input is other than integer
		{
			System.out.println("(only numeric values are allowed... try again)");
			calculateWins(stake);												// method call if user input is not integer
		}																		// to retry with correct input
		catch(Exception e)
		{
			System.out.println(e.getMessage());									// handles other exceptions
		}
	}
}
