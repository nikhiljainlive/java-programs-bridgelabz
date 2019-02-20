package functionalprograms;

/**
 * @purpose Class Declaration for finding Euclidean Distance to points of origin
 * @author Nikhil Jain
 * @version 1.0
 */
public class Distance 
{
	/**
	 * @purpose calculates Euclidean distance of a specified point to points of origin
	 * @param void
	 * @return void
	 */
	public static void findEDistance() 
	{
		try
		{
		double x = Utility.input("Enter x: ");
		double y = Utility.input("Enter y: ");
		
		double distance = Math.sqrt((x*x) + (y*y));
		
		System.out.print("The Euclidean distance is: " + distance + "\n");
		}
		catch(NumberFormatException e)												// if user-input is other than integer
		{
			System.out.println("(only integer values are allowed.. try again)");
			findEDistance();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());										// handles other exceptions
		}
	}
}
