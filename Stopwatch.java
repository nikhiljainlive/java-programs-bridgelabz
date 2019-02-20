package functionalprograms;

/**
 * @purpose class declaration of stop-watch program
 * @author Nikhil Jain
 * @version 1.0
 */
public class Stopwatch
{
	/**
	 * @purpose displays the stop-watch timer
	 * @param void
	 * @return void
	 */
	public static void displayTimer()
	{
		try
		{
			int startT = (int) System.currentTimeMillis();								// starting timer
			System.out.println("Stopwatch started! enter any key to stop...");
			Utility.scan.nextLine();
			System.out.println(Utility.stopWatchTimer(startT));							// calling stopWatch Timer method from utility class
		}
		catch(Exception e)																// handles exceptions
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	
}
