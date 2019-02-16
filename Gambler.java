package functionalprograms;

// Class declaration for Gambler Program
public class Gambler 
{
	// asks to enter value of stake from user
	public static void playGambler()
	{
		try
		{
			int stakeValue = Utility.input("enter Stake: ");
			if(Utility.isLessthan(stakeValue, 1) == false)
			{
				calculateWins(stakeValue);
			}
			else
			{
				System.out.println("stake should be greater than zero");
				playGambler();
			}
			
		}
		catch(Exception e)
		{
			System.out.println("enter values as numbers.. Try again!");
			playGambler();
		}
	}
	
	// calculates wins, percentage of wins and loss
	// takes stake as argument
	public static void calculateWins(int stake)
	{	
		try {
			int goal = Utility.input("enter Goal: ");
			
			if(Utility.isLessthan(goal, 0) == false)
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
					}
				}
				
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
				}
			}
			else
			{
				System.out.println("goal can not be negative.. Try again!");
				calculateWins(stake);
			}
		}
		catch(Exception e)
		{
			System.out.println("enter values as numbers.. Try again!");
			calculateWins(stake);
		}
	}
}
