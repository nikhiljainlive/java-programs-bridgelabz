package functionalprograms;

// class declaration to print numbers which are palindromes and anagrams
public class PAPrimeNumbers
{
	public static void PalinAnagramPrimes()
	{
		int r1 = Utility.input("Enter initial range: ");
		int r2 = Utility.input("Enter final range: ");
		String primeStr = Utility.getPrimeNumbers(r1, r2);				// returns prime numbers
		
		Utility.palindromicPrime(primeStr);								// prints palindromic prime numbers through method of utility class
		Utility.anagramPrimes(primeStr);								// prints prime numbers which are anagrams
	}
}
