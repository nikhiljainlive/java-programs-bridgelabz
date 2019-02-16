package functionalprograms;

//Class Declaration of PrimeNumbers Program
public class PrimeNumbers
{
	// prints the prime numbers by calling Utility Class method
	public static void printPrimeNum()
	{		
		int r1 = Utility.input("Enter initial range: ");
		int r2 = Utility.input("Enter final range: ");
   
		Utility.getPrimeNumbers(r1, r2);							// calling method
   }

}

