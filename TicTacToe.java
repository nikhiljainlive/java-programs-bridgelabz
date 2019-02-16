package functionalprograms;

// Class Declaration of TicTacToe Game
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
	
	/*public static boolean isEmpty()
	{
		if(a.length != 0)
		{
			return true;
		}
		System.out.println("Game Stopped!");
		return false;
	}*/
	
	// to take input from player one
	public static void playerOne()
	{
		int position = Utility.input("Enter the position: ");
		if(position >= 1 && position <= 9)
		{
			if(position == 1 && a[0][0] == '-')
			{
				a[0][0] = 'X';
				//occupied = false;
			}
			else if(position == 2 && a[0][1] == '-')
			{
				a[0][1] = 'X';
				//occupied = false;
			}
			else if(position == 3 && a[0][2] == '-')
			{
				a[0][2] = 'X';
				//occupied = false;
			}
			else if(position == 4 && a[1][0] == '-')
			{
				a[1][0] = 'X';
				//occupied = false;
			}
			else if(position == 5 && a[1][1] == '-')
			{
				a[1][1] = 'X';
				//occupied = false;
			}
			else if(position == 6 && a[1][2] == '-')
			{
				a[1][2] = 'X';
				//occupied = false;
			}
			else if(position == 7 && a[2][0] == '-')
			{
				a[2][0] = 'X';
				//occupied = false;
			}
			else if(position == 8 && a[2][1] == '-')
			{
				a[2][1] = 'X';
				//occupied = false;
			}
			else if(position == 9 && a[2][2] == '-')
			{
				a[2][2] = 'X';
				//occupied = false;
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
	
	//public static boolean isOccupied(char[] a)
	//{
		//for()
	//}
	
	// generates random number from 1 to 9 and insert input for computer's turn
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
			//occupied = true;
			}
		}
		
	}
	
	/*public static boolean isOccupied(int position)
	{
		if()
		{
			return false;
		}
		return true;
	}*/
	
	// displays the game-board 
	public static void display()
	{
		/*for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println(); */
		
			System.out.println(a[0][0] + " | " + a[0][1] + " | " + a[0][2]);
			System.out.println("---------");
			System.out.println(a[1][0] + " | " + a[1][1] + " | " + a[1][2]);
			System.out.println("---------");
			System.out.println(a[2][0] + " | " + a[2][1] + " | " + a[2][2]);
		//}
	}
	
	// checks condition if player has won
	public static boolean isPlayerWon()
	{
		if(a[0][0] == 'X' && a[0][1]  == 'X' && a[0][2] == 'X' || a[0][0] == 'X' && a[1][0]  == 'X' && a[2][0] == 'X' || a[0][1] == 'X' && a[1][1]  == 'X' && a[2][1] == 'X' || a[0][2] == 'X' && a[1][2]  == 'X' && a[2][2] == 'X' || a[1][0] == 'X' && a[1][1]  == 'X' && a[1][2] == 'X' || a[2][0] == 'X' && a[2][1]  == 'X' && a[2][2] == 'X' || a[0][0] == 'X' && a[1][1]  == 'X' && a[2][2] == 'X' || a[0][2] == 'X' && a[1][1]  == 'X' && a[2][0] == 'X' )
		{
			return true;
		}
		return false;
	}
	
	// checks if computer has won
	public static boolean isComputerWon()
	{
		if(a[0][0] == 'O' && a[0][1]  == 'O' && a[0][2] == 'O' || a[0][0] == 'O' && a[1][0]  == 'O' && a[2][0] == 'O' || a[0][1] == 'O' && a[1][1]  == 'O' && a[2][1] == 'O' || a[0][2] == 'O' && a[1][2]  == 'O' && a[2][2] == 'O' || a[1][0] == 'O' && a[1][1]  == 'O' && a[1][2] == 'O' || a[2][0] == 'O' && a[2][1]  == 'O' && a[2][2] == 'O' || a[0][0] == 'O' && a[1][1]  == 'O' && a[2][2] == 'O' || a[0][2] == 'O' && a[1][1]  == 'O' && a[2][0] == 'O' )
		{
			return true;
		}
		return false;
	}
	
	// starts the game-play and this method is the entry-point of the game
	public static void playGame()
	{
		try {
			System.out.println("Welcome to Tic-Tac-Toe Game!\n");
			System.out.println("Player is: 'X' and Computer is: 'O'");
			System.out.println("enter positions from 1 to 9");
			display();
			
			/*if(occupied)
			{
				System.out.println("Position already occupied");
				occupied = false;
				playGame();
			}*/
			
			if(isPlayerWon() == false && isComputerWon() == false)							// 
			{
				while(length != 0 && isPlayerWon() == false && isComputerWon() == false)			//  || isComputerWon() == false
				{
					try {
						System.out.println("\nPlayer Turn:");
						playerOne();
						display();
						length--;
						if(length != 0 && occupied == false) 
						{
							//System.out.println(length);
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
					catch(Exception e)
					{
						System.out.println("Wrong input entered! Try again...");			// if user-input is other than integer
						
					}
				}
			}
			if(isPlayerWon())
			{
				System.out.println("\nYou Won!");
			}
			if(isComputerWon())
			{
				System.out.println("\nYou Lose... Computer Won!");
			}
			if(length == 0 && isPlayerWon() == false && isComputerWon() == false)
			{
				System.out.println("\n Its a Draw");
			}
		}
		catch(Exception e)
		{
			System.out.println("Wrong input entered! Try again...");					// handles other exceptions
			//playGame();
		}
	}
}
