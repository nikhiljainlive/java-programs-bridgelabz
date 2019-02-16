package functionalprograms;

public class SquareRoot 
{
	public static void sqrt()
	{
		double c = Utility.input("enter num: ");
		double epsilon = 3.05902321E-7 ;
		double t = -c;
		
		while((Math.abs(t - (c/t))) > (epsilon*t))
		{
			t = (t - (c/ t)) / 2.0;
		}
		
		System.out.println(t);
	}
}
