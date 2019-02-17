package functionalprograms;

public class GuesstheNumber
{
	public static void main(String[] args)
	{
		int num = Integer.parseInt(args[0]);
		int n = (int) Math.pow(2, num);
		
		guessNum(n,num);
		
	}
	
	public static void guessNum(int n, int num)
	{
		int li = 0, hi = n - 1, mid = (li + hi) / 2;
		for(int i = 0; i < num; i++)
		{
			System.out.println("Is your number less than " + mid + " ?");
			boolean value = Utility.scan.nextBoolean();
			if(value == true)
			{
				hi = mid - 1;
			}
			else
			{
				li = mid + 1;
			}
			mid = (li + hi) / 2;
		}
		if(li > hi)
		{
			System.out.println("Your number is: " + mid);
		}
	}
	
}
