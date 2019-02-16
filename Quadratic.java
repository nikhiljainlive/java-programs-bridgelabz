package functionalprograms;

//Class Declaration of calculating Quadratic Equations
public class Quadratic
{
	// calculates the quadratic roots of a quadratic equation
	// takes a,b,c as input and here b should be greater than a and c
	// to calculate roots
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
				System.out.println("value of b should be greater than a & c\n");
				findEquation();
			}	
		}
		catch(Exception e)
		{
			System.out.println("enter only numbers.. Try again!\n");
			findEquation();
		}
	}
}
