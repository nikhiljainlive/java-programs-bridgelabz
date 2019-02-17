package functionalprograms;

// class declaration of Leap year program
public class LeapYear 
{
	// checks the year is leap year or not
	public static void isLeapYear()
	{
		try 
		{
			int year = Utility.input("enter the year: ");
			int count = yearCount(year);
			if(count == 4 && Utility.isLessthan(year, 0) == false)
			{
				if(year % 4 == 0 || year % 400 == 0)
				{
					System.out.println(year + " is a Leap year");
				}
				else
				{
					System.out.println(year + " is not Leap year");
				}//end of inner if-else block
			}
			else
			{
				System.out.println("(entered year should be in correct format)");
				isLeapYear();
			}//end of outer if-else block
		}
		catch(NumberFormatException e)												// if user-input is other than integer 
		{
			System.out.println("(characters are not allowed.. try again)");
			isLeapYear();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());										// handles other exceptions
		}
	}
	
	//checks if the year is of 4 digits or not
	public static int yearCount(int year)
	{
		int count = 0;
		while(year != 0)
		{
			year = year / 10;
			count++;
		}
		return count;														// returns the digits in entered input
	}
}
