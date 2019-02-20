package functionalprograms;

/**
 * @purpose class declaration to print numbers which are palindromes and anagrams
 * @author Nikhil Jain
 * @version 1.0
 */
public class PAPrimeNumbers
{
	/**
	 * @purpose displays palindromic prime numbers and prime numbers which are anagrams
	 * @param void
	 * @return void
	 */
	public static void PalinAnagramPrimes()
	{
		try
		{
			int r1 = Utility.input("Enter initial range: ");
			int r2 = Utility.input("Enter final range: ");
			String primeStr = Utility.getPrimeNumbers(r1, r2);				// returns prime numbers
			
			Utility.palindromicPrime(primeStr);								// prints palindromic prime numbers through method of utility class
			Utility.anagramPrimes(primeStr);								// prints prime numbers which are anagrams
		}
		catch(NumberFormatException e)
		{
			System.out.println("numbers are not allowed.. try again");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}	
	}
}
