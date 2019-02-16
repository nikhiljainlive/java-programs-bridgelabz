package functionalprograms;

public class Factors
{
	public static void findPrimeFactors()
	{
		try
		{
			int num = Utility.input("Enter number: "), i = 2;
			
			if(Utility.isLessthan(num, 2) == false)
			{
				while(i <= num)
				{
					if(num % i == 0)
					{
						System.out.print(i + ",");
						num = num / i;
					}
					else
					{
						i++;
					}
				}
				System.out.println();
			}
			else
			{
				System.out.println("enter number greater than one");
				findPrimeFactors();
			}
		}
		catch(Exception e)
		{
			System.out.println("Incorrect Input... Try Again!");
			findPrimeFactors();
		}
	}
}
