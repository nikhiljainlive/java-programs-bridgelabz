package functionalprograms;

/**
 * @purpose Class Declaration of calculating Quadratic Equations
 * @author Nikhil Jain
 * @version 1.0
 */
public class Quadratic
{

	/**
	 * @purpose calculates and prints the quadratic roots of a quadratic equation
	 * @param void
	 * @return void
	 */
	public static void findEquation()
	{
		try
		{
			int a = Utility.input("Enter value of a: ");
			int b = Utility.input("Enter value of b: ");
			int c = Utility.input("Enter value of c: ");
			
			if(b > a && b > a)
			{
				double delta = (b*b)-(4*a*c);
				double root1 = (-b + Math.sqrt(delta))/(2*a);
				double root2 = (-b - Math.sqrt(delta))/(2*a);
				
				System.out.println(root1 + ", " + root2);
			}
			else
			{
				System.out.println("(value of b should be greater than a & c)");
				findEquation();
			}	
		}
		catch(NumberFormatException e)											// if user-input is other than integer
		{
			System.out.println("(enter only numbers.. Try again!)");
			findEquation();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());									// handles other exceptions
		}
	}
}
