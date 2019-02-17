package functionalprograms;

//Class Declaration of stop-watch program
public class Stopwatch
{
	// displays the stop-watch timer
	// time class has been used for time reference
	public static void displayTimer()
	{
		try
		{
			int startT = (int) System.currentTimeMillis();					// starting timer
			System.out.println("Stopwatch started! enter any key to stop...");
			Utility.scan.nextLine();
			System.out.println(Utility.stopWatchTimer(startT));							// calling stopWatch Timer method from utility class
		}
		catch(Exception e)											// handles exceptions
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	
}
