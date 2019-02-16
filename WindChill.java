package functionalprograms;

//Class Declaration of WindChill Program
public class WindChill 
{
	// calculates the wind-chill
	// takes temperature and wind-speed as input
	 public static void findWindChill()
	 {
		 try 
		 {
			 double t = Utility.input("enter temperature t: ");
			 double v = Utility.input("enter wind speed v: ");
			 
			 if (t <= 50 && v >= 3 && v <= 120)
			 {
				 double w = 35.74 + (0.6215 * t) + ((0.4275 * t) - 35.75) * Math.pow(v, 0.16);
				 System.out.println("Wind Chill: " + w);
			 }
			 else
			 {
				 System.out.println("enter value of t less than 50\nor value of v less than 120 or greater than 3");
				 findWindChill();
			 }
		 }
		 catch(Exception e)
		 {
			 System.out.println("values other than numbers are not allowed\nTry again!\n");
			 findWindChill();
		 }
	 }
}
