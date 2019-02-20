package functionalprograms;

/**
 * @purpose class declaration for printing power of power program
 * @author Nikhil Jain
 * @version 1.0
 */
public class PowerOf2   
{
	/**
	 * @purpose calculates power of 2
	 * @param args
	 * @return void
	 */
	public static void main(String[] args)
	{
		try
		{
			int n = Integer.parseInt(args[0]);									// takes arguments from command line
	
			if(args.length == 1)
			{
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
				}
			}
			else
			{
				System.out.println("one argument is allowed.. try again");
			}
		}
		catch(NumberFormatException e)														// if user-input is other than integer 
		{
			System.out.println("(only numbers are allowed.. try again)");
		}
		catch(ArrayIndexOutOfBoundsException e)												// if arguments entered are incorrect
		{
			System.out.println("entered arguments should be 1.. try again");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());												// handles other exceptions
		}
	}
}
