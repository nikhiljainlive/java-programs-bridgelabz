package functionalprograms;
 
/**
 * @purpose class declaration of TicTacToe Game
 * @author Nikhil Jain
 * @version 1.0
 */
public class TicTacToe
{
	// defining array as static as to use it in all methods easily
	static char[][] a = new char[][]
			{
		{'-','-','-'},
		{'-','-','-'},
		{'-','-','-'}
			};
	static int length = a.length * 3;
	static boolean occupied = false;

	/**
	 * @purpose takes input from player one and performs player's chance
	 * @param void
	 * @return void
	 */
	public static void playerOne()
	{
		int position = Utility.input("Enter the position: ");
		if(position >= 1 && position <= 9)
		{
			if(position == 1 && a[0][0] == '-')
			{
				a[0][0] = 'X';
			}
			else if(position == 2 && a[0][1] == '-')
			{
				a[0][1] = 'X';
			}
			else if(position == 3 && a[0][2] == '-')
			{
				a[0][2] = 'X';
			}
			else if(position == 4 && a[1][0] == '-')
			{
				a[1][0] = 'X';
			}
			else if(position == 5 && a[1][1] == '-')
			{
				a[1][1] = 'X';
			}
			else if(position == 6 && a[1][2] == '-')
			{
				a[1][2] = 'X';
			}
			else if(position == 7 && a[2][0] == '-')
			{
				a[2][0] = 'X';
			}
			else if(position == 8 && a[2][1] == '-')
			{
				a[2][1] = 'X';
			}
			else if(position == 9 && a[2][2] == '-')
			{
				a[2][2] = 'X';
			}
			else
			{
				System.out.println("Position already occupied! Try another position");		//  prints if position is already occupied
				playerOne();																//  and takes input again from user
			}
		}
		else
		{
			System.out.println("enter positions between 1 and 9");							// condition for input other than 1 to 9
			playerOne();
		}
	}
	
	/**
	 * @purpose generates random number from 1 to 9 and insert input for computer's turn
	 * @param void
	 * @return void
	 */
	public static void computerTurn()
	{
		int position = (int) (Math.random()*9) ;
		
		if(position == 1 &&  a[0][0] == '-')
		{
			a[0][0] = 'O';
		}
		else if(position == 2 && a[0][1] == '-')
		{
			a[0][1] = 'O';
		}
		else if(position == 3 && a[0][2] == '-')
		{
			a[0][2] = 'O';
		}
		else if(position == 4 && a[1][0] == '-')
		{
			a[1][0] = 'O';
		}
		else if(position == 5 && a[1][1] == '-')
		{
			a[1][1] = 'O';
		}
		else if(position == 6 && a[1][2] == '-')
		{
			a[1][2] = 'O';
		}
		else if(position == 7 && a[2][0] == '-')
		{
			a[2][0] = 'O';
		}
		else if(position == 8 && a[2][1] == '-')
		{
			a[2][1] = 'O';
		}
		else if(position == 9 && a[2][2] == '-')
		{
			a[2][2] = 'O';
		}
		else
		{
			if(occupied == false)									// generates another random number if 
			{														// the array position is already occupied
				computerTurn();
			}
		}
		
	}
	  
	/**
	 * @purpose displays the game-board
	 * @param void
	 * @return void
	 */
	public static void display()
	{
			System.out.println(a[0][0] + " | " + a[0][1] + " | " + a[0][2]);
			System.out.println("---------");
			System.out.println(a[1][0] + " | " + a[1][1] + " | " + a[1][2]);
			System.out.println("---------");
			System.out.println(a[2][0] + " | " + a[2][1] + " | " + a[2][2]);
		//}
	}

	/**
	 * @purpose checks condition if player has won
	 * @param void
	 * @return boolean
	 */
	public static boolean isPlayerWon()
	{
		if(a[0][0] == 'X' && a[0][1]  == 'X' && a[0][2] == 'X' || a[0][0] == 'X' && a[1][0]  == 'X' && a[2][0] == 'X' || a[0][1] == 'X' && a[1][1]  == 'X' && a[2][1] == 'X' || a[0][2] == 'X' && a[1][2]  == 'X' && a[2][2] == 'X' || a[1][0] == 'X' && a[1][1]  == 'X' && a[1][2] == 'X' || a[2][0] == 'X' && a[2][1]  == 'X' && a[2][2] == 'X' || a[0][0] == 'X' && a[1][1]  == 'X' && a[2][2] == 'X' || a[0][2] == 'X' && a[1][1]  == 'X' && a[2][0] == 'X' )
		{
			return true;
		}
		return false;
	}

	/**
	 * @purpose returns true if computer has won else returns false
	 * @param void
	 * @return boolean
	 */
	public static boolean isComputerWon()
	{
		if(a[0][0] == 'O' && a[0][1]  == 'O' && a[0][2] == 'O' || a[0][0] == 'O' && a[1][0]  == 'O' && a[2][0] == 'O' || a[0][1] == 'O' && a[1][1]  == 'O' && a[2][1] == 'O' || a[0][2] == 'O' && a[1][2]  == 'O' && a[2][2] == 'O' || a[1][0] == 'O' && a[1][1]  == 'O' && a[1][2] == 'O' || a[2][0] == 'O' && a[2][1]  == 'O' && a[2][2] == 'O' || a[0][0] == 'O' && a[1][1]  == 'O' && a[2][2] == 'O' || a[0][2] == 'O' && a[1][1]  == 'O' && a[2][0] == 'O' )
		{
			return true;
		}
		return false;
	}

	/**
	 * @purpose starts the game-play and this method is the entry-point of the game
	 * @param void
	 * @return void
	 */
	public static void playGame()
	{
		System.out.println("Welcome to Tic-Tac-Toe Game!\n");
		System.out.println("Player is: 'X' and Computer is: 'O'");
		System.out.println("(enter positions from 1 to 9)");
		display();
		
		if(isPlayerWon() == false && isComputerWon() == false)							 
		{
			while(length != 0 && isPlayerWon() == false && isComputerWon() == false)
			{
				try {
					System.out.println("\n=====================================================================");
					System.out.println("\nPlayer Turn:");
					playerOne();
					display();
					length--;
					if(length != 0 && occupied == false) 
					{
						System.out.println("\nComputer Turn:\n");
						computerTurn();
						display();
						length--;
					}
					else
					{
						break;
					}
				}
				catch(NumberFormatException e)
				{
					System.out.println("(enter positions in numbers.. try again)");		// if user-input is other than integer
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());									// handles other exceptions
				}
			}
		}
		if(isPlayerWon())
		{
			System.out.println("\nYou Won!");
			System.out.println("=====================================================================");
		}
		if(isComputerWon())
		{
			System.out.println("\nYou Lose... Computer Won!");
			System.out.println("=====================================================================");
		}
		if(length == 0 && isPlayerWon() == false && isComputerWon() == false)
		{
			System.out.println("\nIts a Draw");
			System.out.println("=====================================================================");
		}
	}
}
