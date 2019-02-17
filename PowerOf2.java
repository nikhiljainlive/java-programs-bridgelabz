package functionalprograms;

public class PowerOf2   //class declaration
{
	//calculates power of 2
	public static void main(String[] args)
	{
		try
		{
			int n = Integer.parseInt(args[0]);														//Utility.input("Enter N: ");
	
			if(n >= 0 && n < 31)
			{

				for(int i = 0; i <= n; i++)
				{
					int res = (int) Math.pow(2, i);
					System.out.println("2 ^ " + i + " = " + res);
				}
				
				System.out.println("");
			}
			else
			{
				System.out.println("(value should be less than 31 and greater than zero)");
				//findPowerOfTwo();
			}
		}
		catch(NumberFormatException e)												// if user-input is other than integer 
		{
			System.out.println("(only numbers are allowed.. try again)");
			//findPowerOfTwo();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());										// handles other exceptions
		}
	}
}
