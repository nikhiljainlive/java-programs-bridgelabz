package functionalprograms;

//Class Declaration of stop-watch program
public class Stopwatch
{
	// displays the stop-watch timer
	// time class has been used for time reference
	public static void displayTimer()
	{
		int startT = (int) System.currentTimeMillis();					// starting timer
		System.out.println("Stopwatch started! enter any key to stop...");
		Utility.scan.nextLine();
		System.out.println(Utility.stopWatchTimer(startT));							// calling stopWatch Timer method from utility class
	}
	
	// formats the string
	/*public static String toString(int h, int m, int s, int ms)
	{
		String string = String.format("%02d h: %02d m: %02d s: %02d ms", h , ((m>=0 && m<60) ? m : m % 60), ((s>=0 && s<60) ? s : s % 60), ((ms>=0 && ms<100 ? ms : ms % 1)));
		return string;
	}*/
	
	
}
