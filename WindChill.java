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
			 if (t <= 50)
			 {
				 double v = Utility.input("enter wind speed v: ");
				 
				 if (v >= 3 && v <= 120)
				 {
					 double w = 35.74 + (0.6215 * t) + ((0.4275 * t) - 35.75) * Math.pow(v, 0.16);
					 System.out.println("Wind Chill: " + w);
				 }
				 else
				 {
					 System.out.println("(value of v less than 120 or greater than 3.. try again)\n");
					 findWindChill();
				 }
			 }
			 else
			 {
				 System.out.println("(enter value of t less than 50)");
				 findWindChill();
			 }
		 }
		 catch(NumberFormatException e)												// if user-input is other than integer
		 {
			 System.out.println("(only integer values are allowed.. try again)\n");
			 findWindChill();
		 }
		 catch(Exception e)
		 {
				System.out.println(e.getMessage());									// handles other exceptions
		 }
	 }
}
