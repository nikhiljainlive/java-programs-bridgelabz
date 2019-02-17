package functionalprograms;

//Class Declaration of PrimeNumbers Program
public class PrimeNumbers
{
	// prints the prime numbers by calling Utility Class method
	public static void printPrimeNum()
	{	
		//try
		//{
			int r1 = Utility.input("Enter initial range: ");
			if(r1 >= 0 && r1 <= 1000)
			{
				int r2 = Utility.input("Enter final range: ");
				if(r2 <= 1000 && r2 > r1)
				{
					Utility.getPrimeNumbers(r1, r2);							// calling method of utility class
				}
				else
				{
					System.out.println("final range cannot be greater than 1000\nor less than initial range\n");
					printPrimeNum();
				}//end of inner if-else block
			}
			else
			{
				System.out.println("initial range cannot be less than 0");
				printPrimeNum();
			}//end of outer if-else block
		//}
		/*catch(Exception e)														// handles exceptions
		{
			System.out.println(e.getMessage());
			printPrimeNum();
		}*/
		
   }

}

