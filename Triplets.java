package functionalprograms;
 
/**
 * @purpose Class declaration for Triplets which sums up to zero
 * @author Nikhil Jain
 * @version 1.0
 */
public class Triplets
{ 
	/**
	 * @purpose finds the three numbers which sums up to zero
	 * @param void
	 * @return void
	 */
	public static void findTriplets()
	{
		try
		{
			int capacity = Utility.input("No. of Elements you want to check: "), count = 0;
			int[] a = new int[capacity];
			
			Utility.readIntArray(a, capacity);
			
			for(int i = 0; i < capacity; i++)
			{
				for(int j = i+1; j < capacity; j++)
				{
					for (int k = j+1; k < capacity; k++)
					{
						if(a[i]+a[j]+a[k] == 0)
						{
							System.out.print(a[i] + " + " + a[j] + " + " + a[k] + " = 0\n");
							count++;
						}
					}// end of inner k loop
				}// end of inner j loop
			}//end of outer i loop
			
			if(count == 0)
			{
				System.out.println("There are no distinct triplets found");
			}
			else
			{
				System.out.println("No of Triplets :" + count);
			}
		}
		catch(NumberFormatException e)											// if user-input is other than integer
		{
			System.out.println("(characters are not allowed.. try again)");
			findTriplets();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());									// handles other exceptions
		}
	}
}
