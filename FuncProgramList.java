package functionalprograms;

// Class declaration for functional program List
public class FuncProgramList 
{
	// method for displaying functional program list
	public static void programList()
	{
		System.out.println("\n===============================================================================================");
		System.out.println("----Functional Programs----");
		System.out.println("Choose from the following:");
		System.out.println("1. Replace String");
		System.out.println("2. Flip Coin");
		System.out.println("3. Leap Year");
		System.out.println("4. Power of 2");
		System.out.println("5. Harmonic Number");
		System.out.println("6. Prime Factors");
		System.out.println("7. Gambler");
		System.out.println("8. Coupon Numbers");
		System.out.println("9. 2D Arrays");
		System.out.println("10. Sum of 3 Integers Adds to Zero");
		System.out.println("11. Euclidean Distance");
		System.out.println("12. String Permutation");
		System.out.println("13. Stopwatch Timer");
		System.out.println("14. Tic-Tac-Toe");
		System.out.println("15. Quadratic Equation");
		System.out.println("16. WindChill");
		System.out.println("===============================================================================================");
		
		functMenu();									// calling method which performs switch case statements
	}
	
	// implements switch case statements
	public static void functMenu()
	{
		boolean value = true;
		while(value) 
		{
			try
			{
				switch(Utility.input("===============================================================================================\n(enter 0 for Main Menu or -1 to re-display current menu)\n\nenter choice(Functional Programs menu): "))
				{
					case -1: programList();
							break;
				
					case 0: EntryPoint.programList();					// returns back to main method
							return;						
					
				 	case 1: ReplaceString.replaceString();				// replace string method
				 			break;
				 			
				 	case 2: FlipCoin.flipCoin();						// flip coin method
			 				break;
			 			
				 	case 3: LeapYear.isLeapYear();						// method for finding leap year
			 				break;
			 			
				 	//case 4: PowerOf2.findPowerOfTwo();			// cmd line -method for calculating power of 2
			 		//		break;
			 			
				 	case 5: Harmonicnum.findHarmonicNum();				// method for finding harmonic number
			 				break;
			 			
				 	case 6: PrimeFactors.findPrimeFactors();			// method for printing prime factors
			 				break;
			 			
				 	case 7: Gambler.playGambler();						// gambler program
			 				break;
			 			
				 	case 8: Coupons.getCouponNums();			 		// coupon numbers program
			 				break;
			 			
				 	case 9: TwoDArray.twodarray();						// 2-d array program
			 				break;
			 			
				 	case 10: Triplets.findTriplets();					// method for finding three numbers which adds up to zero
			 				break;
			 			
				 	case 11: Distance.findEDistance();					// finds euclidean distance
				 			break;
				 			
				 	case 12: System.out.println("Separate program"); 	// separate program
		 					break;
		 					
				 	case 13: Stopwatch.displayTimer();					// stop-watch timer
		 					break;
		 					
				 	case 14: TicTacToe.playGame();						// starts the Tic-Tac-Toe game
		 					break;
				 			
				 	case 15: Quadratic.findEquation();					// finds roots of quadratic equation
 							break;
				 			
				 	case 16: WindChill.findWindChill();					// finds wind-chill
		 					break;
		 					
				 					
		 			default: System.out.println("Invalid Option! Try Again...");
				}
			}
			catch(NumberFormatException e)											// if user-input is other than integer
			{
				System.out.println("Invalid Command.. Try again!\n");
				functMenu();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());									// handles other exceptions
			}
		}
	}
}
