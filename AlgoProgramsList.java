package functionalprograms;

public class AlgoProgramsList
{
	public static void programList()
	{
		System.out.println("===============================================================================================");
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
		System.out.println("13. monthlyPayment");
		System.out.println("14. sqrt");
		System.out.println("15. Binary Conversion");
		System.out.println("16. Binary.java");
		System.out.println("17. List of Tasks");
		System.out.println("enter 0 to return to main menu");
		System.out.println("===============================================================================================");
	
		functMenu();
	}
	
	public static void functMenu()
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
							
				 	case 1: Anagram.findAnagram();
				 			break;
				 			
				 	case 2: PrimeNumbers.printPrimeNum();
			 				break;
			 			
				 	//case 3: 			
			 		//		break;
			 			
				 	case 4: EntryPoint.stringComp();						//binary search for string
			 				break;
			 			
				 	//case 5: 
			 		//		break;
			 			
				 	//case 6: 
			 		//		break;
			 			
				 	//case 7: 
			 		//		break;
			 			
				 	case 8: BubbleSort.sortNumbers();						// bubble sort and binary search
			 				break;
			 			
				 	//case 9: 
			 		//		break;
			 			
				 	//case 10: 
			 		//		break;
			 			
				 	//case 11: 
				 	//		break;
				 			
				 	case 12: ConvertTemperature.convertTemp();
		 					break;
		 					
				 	//case 13: 
		 			//		break;
		 					
				 	case 14: SquareRoot.sqrt();
		 					break;
				 			
				 	case 15: BinaryConversion.findBinaryNum();
							break;
				 			
				 	//case 16: 
		 			//		break;
		 					
				 	//case 17: 
	 				//		break;
				 					
		 			default: System.out.println("Invalid Option! Try Again...");
				}
			}
			catch(Exception e)
			{
				System.out.println("Invalid Command.. Try again!\n");
				functMenu();
			}
		}
	}
}