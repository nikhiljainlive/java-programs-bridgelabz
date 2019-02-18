package functionalprograms;

// Class declaration of Algorithm programs List
public class AlgoProgramsList
{
	// displays programs list
	public static void programList()
	{
		System.out.println("\n===============================================================================================");
		System.out.println("----Algorithm Programs----");
		System.out.println("Choose from the following:");
		System.out.println("1. Anagram");
		System.out.println("2. Prime Numbers");
		System.out.println("3. Prime Numbers (that are Palindrome and Anagrams)");
		System.out.println("4. *(Binary search for String added)");
		System.out.println("5. Question to find your number");
		System.out.println("6. Search the Word from Word-List");
		System.out.println("7. Insertion Sort of String");
		System.out.println("8. Bubble Sort of Integers *(Binary Search Added)");
		System.out.println("9. Merge Sort");
		System.out.println("10. Fewest notes returned for Vending machine");
		System.out.println("11. day Of Week");
		System.out.println("12. temperaturConversion");
		System.out.println("13. monthlyPayment (separate program- cmd line)");
		System.out.println("14. sqrt");
		System.out.println("15. Binary Conversion");
		System.out.println("16. Binary.java");
		System.out.println("===============================================================================================");
	
		algoMenu();						// calling method which performs list
	}
	
	// performs switch case statements 
	public static void algoMenu()
	{
		boolean value = true;
		while(value) 
		{
			try
			{
				switch(Utility.input("===============================================================================================\n(enter 0 for Main Menu or -1 to re-display current menu)\n\nenter choice (Alogirthm Programs menu): "))
				{
					case -1: programList();
							break;
				
					case 0: EntryPoint.main(null);
							break;
							
				 	case 1: Anagram.findAnagram();							// method for finding anagrams
				 			break;
				 			
				 	case 2: PrimeNumbers.printPrimeNum();					// method which prints prime numbers
			 				break;
			 			
				 	//case 3: 			
			 		//		break;`
			 			
				 	case 4: EntryPoint.stringComp();						// binary search for string
			 				break;
			 			
				 	//case 5: GuesstheNumber.questions();					// command line arguments
			 		//		break;
			 			
				 	//case 6: 
			 		//		break;
			 			
				 	//case 7: 
			 		//		break;
			 			
				 	case 8: BubbleSort.sortNumbers();						// bubble sort and binary search
			 				break;
			 			
				 	//case 9: 
			 		//		break;
			 			
				 	case 10: VendingMachine.fewNotes();
			 				break;
			 			
				 	//case 11: 												// command line arguments
				 	//		break;
				 			
				 	case 12: ConvertTemperature.convertTemp();				// Temperature conversion program
		 					break;
		 					
				 	//case 13: 												// separate program by command line
		 			//		break;
		 					
				 	case 14: SquareRoot.sqrt();								// method which finds square root
		 					break;
				 			
				 	case 15: BinaryConversion.findBinaryNum();				// Decimal to Binary conversion method
							break;
				 			
				 	case 16: Binary.swapBinaryNum();
		 					break;
		 					
				 	//case 17: 
	 				//		break;
				 					
		 			default: System.out.println("Invalid Option! Try Again...");
				}
			}
			catch(NumberFormatException e)												// if user-input is other than integer 
			{
				System.out.println("Invalid Command.. Try again!\n");
				algoMenu();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());										// handles other exceptions
			}
		}
	}
}