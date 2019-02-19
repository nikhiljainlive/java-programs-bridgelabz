package functionalprograms;

// class declaration of calculating monthly payment program
public class MonthlyPayment 
{
	// main method to print monthly payment
	// takes 3 arguments - p(principle loan), y(years) and r(rate of interest)
	public static void main(String[] args)										
	{
		try
		{
			double p = Double.parseDouble(args[0]);
			double y = Double.parseDouble(args[1]);
			double r = Double.parseDouble(args[2]);
			
			if (p > 0 && y > 0 && r > 0 && args.length == 3 && p > y && p > r)
			{
				//System.out.println("in");
				System.out.println("Payment is " + calculatePayment(p, y, r));	
			}
			else
			{
				System.out.println("invalid input.. try again");
				System.out.println("value of p should be greater than y and r");
			}
		}
		catch(NumberFormatException e)														// if input is other than integer
		{
			System.out.println("only number input allowed.. try again");
		}
		catch(ArrayIndexOutOfBoundsException e)												// if input is other than integer
		{
			System.out.println("entered arguments should be 3.. try again");
		}
		catch(Exception e)																	// handles all other exceptions
		{
			System.out.println("in");
			System.out.println(e.getMessage());
		}
	}
	
	// calculates payment
	// takes loan, years, rate as arguments
	public static double calculatePayment(double loan, double years, double rate)
	{
		double n = 12 * years, r = (rate / (12 * 100)), power = Math.pow((1+ r), (-n));
		double payment = (loan * r) / (1 - power);
		
		payment = Math.round(payment * 1000);
		payment = payment / 1000;
		return payment;
	}
}
