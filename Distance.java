package functionalprograms;

// Class Declaration for finding Euclidean Distance to points of origin
public class Distance 
{
	// calculates Euclidean distance of a specified point to points of origin
	public static void findEDistance() 
	{
		try
		{
		double x = Utility.input("Enter x: ");
		double y = Utility.input("Enter y: ");
		
		double distance = Math.sqrt((x*x) + (y*y));
		
		System.out.print("The Euclidean distance is: " + distance + "\n");
		}
		catch(Exception e)
		{
			System.out.println("enter values in numbers.. Try again!\n");
			findEDistance();
		}
	}
}
