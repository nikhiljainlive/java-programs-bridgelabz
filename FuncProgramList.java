package functionalprograms;

public class FuncProgramList 
{
	public static void programList()
	{
		System.out.println("===============================================================================================");
		System.out.println("----Functional Programs----");
		System.out.println("Choose from the following:");
		System.out.println("1. Replace String");
		System.out.println("2. Flip Coin");
		System.out.println("3. Leap Year");
		System.out.println("4. Power of 2");
		System.out.println("5. Harmonic Number");
		System.out.println("6. Factors");
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
		System.out.println("enter 0 to return to main menu");
		System.out.println("===============================================================================================");
		
		algoMenu();
	}
	
	public static void algoMenu()
	{
		boolean value = true;
		while(value) 
		{
			try
			{
				switch(Utility.input("\nenter your choice: "))
				{
				
					case 0: EntryPoint.main(null);
							break;
							
				 	case 1: ReplaceString.replaceString();
				 			break;
				 			
				 	case 2: FlipCoin.flipCoin();
			 				break;
			 			
				 	case 3: LeapYear.isLeapYear();
			 				break;
			 			
				 	case 4: PowerOf2.findPowerOfTwo();
			 				break;
			 			
				 	case 5: Harmonicnum.findHarmonicNum();
			 				break;
			 			
				 	case 6: Factors.findPrimeFactors();
			 				break;
			 			
				 	case 7: Gambler.playGambler();
			 				break;
			 			
				 	case 8: CouponNumbers.getCouponNums();
			 				break;
			 			
				 	case 9: TwoDArray.twodarray();
			 				break;
			 			
				 	case 10: Triplets.findTriplets();
			 				break;
			 			
				 	case 11: Distance.findEDistance();
				 			break;
				 			
				 	case 12: System.out.println("Build in Progress"); 
		 					break;
		 					
				 	case 13: Stopwatch.displayTimer();
		 					break;
		 					
				 	case 14: TicTacToe.playGame();
		 					break;
				 			
				 	case 15: Quadratic.findEquation();
 							break;
				 			
				 	case 16: WindChill.findWindChill();
		 					break;
		 					
				 	case 18: BubbleSort.sortNumbers();
				 			break;
				 			
				 	case 19: //BinaryConversion.toBinary();								//Anagram.findAnagram();
				 			break;
				 			
				 	case 20: //PrimeNumbers.printPrimeNum();
				 			break;
				 					
		 			default: System.out.println("Invalid Option! Try Again...");
				}
			}
			catch(Exception e)
			{
				System.out.println("Invalid Command.. Try again!\n");
				algoMenu();
			}
		}
	}
}
