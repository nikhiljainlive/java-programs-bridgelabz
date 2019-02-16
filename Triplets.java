package functionalprograms;

// Class declaration for Triplets which sums up to zero
public class Triplets
{
	// finds the three numbers which sums up to zero
	public static void findTriplets()
	{
		try
		{
			int capacity = Utility.input("No. of Elements you want to check: "), count = 0;
			int[] a = new int[capacity];
			
			Utility.readArray(a, capacity);
			
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
						
					}
					
				}
			}
			
			if(count == 0)
			{
				System.out.println("There are no distinct triplets found");
			}
			else
			{
				System.out.println("No of Triplets :" + count);
			}
		}
		catch(Exception e)
		{
			System.out.println("enter only numbers.. Try again!");
			findTriplets();
		}
	}
}
