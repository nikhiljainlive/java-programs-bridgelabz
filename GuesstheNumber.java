package functionalprograms;

public class GuesstheNumber
{
	public static void main(String[] args)
	{
		try 
		{
			int num = Integer.parseInt(args[0]);
			if (args.length == 1)
			{
				if(num > 0)
				{
					int n = (int) Math.pow(2, num);
					
					guessNum(n,num);	
				}
				else
				{
					System.out.println("entered number should be greater than zero");
				}
			}
			else
			{
				System.out.println("only one argument is allowed..");
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("only numbers allowed as input.. try again");
		}
		catch(ArrayIndexOutOfBoundsException e)												// if input is other than integer
		{
			System.out.println("entered arguments should be 1.. try again");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void guessNum(int n, int num)
	{
		int li = 0, hi = n - 1, mid = (li + hi) / 2;
		for(int i = 0; i < num; i++)
		{
			try 
			{
				System.out.println("Is your number less than " + mid + " ?");
				String value = Utility.stringInput("say 'true' or 'false' : ");														//boolean value = Utility.scan.nextBoolean();
				int isTrue = value.compareTo("true");
				int isFalse = value.compareTo("false");
				if(isTrue == 0 || isFalse == 0)
				{
					if(isTrue == 0)
					{
						hi = mid - 1;
					}
					else if(isFalse == 0)
					{
						li = mid + 1;
					}
					mid = (li + hi) / 2;
					
					if(li > hi)
					{
						System.out.println("Your number is: " + mid);
					}
				}
				else
				{
					System.out.println("only answer with 'true' or 'false'... Try again");
				}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	
	}
	
}
