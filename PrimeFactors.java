package functionalprograms;

// class declaration for PrimeFactors
public class PrimeFactors
{
	// finds prime factors
	public static void findPrimeFactors()
	{
		try
		{
			int num = Utility.input("Enter number: "), i = 2;
			
			if(Utility.isLessthan(num, 2) == false)
			{
				while(i <= num)
				{
					if(num % i == 0)								// if number is divided by value of i
					{												// then prints value of i
						System.out.print(i + ", ");
						num = num / i;
					}
					else											// else iterate value of i
					{
						i++;
					}
				}
				System.out.println();
			}
			else
			{
				System.out.println("(enter number greater than one)");
				findPrimeFactors();
			}//end of if-else block
		}
		catch(NumberFormatException e)												// if user-input is other than integer 
		{
			System.out.println("(characters are not allowed.. try again)");
			findPrimeFactors();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());										// handles other exceptions
		}
	}
}
