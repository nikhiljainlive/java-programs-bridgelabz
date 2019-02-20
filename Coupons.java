package functionalprograms;

/**
 * @purpose class declaration for finding total random numbers for N distinct coupons
 * @author Nikhil Jain
 * @version 1.0
 */
public class Coupons
{
	/**
	 * @purpose return a random coupon number between 0 and n-1
	 * @param n
	 * @return int
	 */
    public static int getCoupon(int n) 
    {
        return (int) (Math.random() * n);
    }

    // 
    /**
     * @purpose return coupon numbers collected before obtaining one of each of the n types
     * @param n
     * @return int
     */
    public static int collect(int n) 
    {
        boolean[] isCollected = new boolean[n];  // isCollected[i] = true if card type i already collected
        int count = 0;                           // total random numbers generated
        int distinct  = 0;                       // distinct random numbers generated

        // repeat until all n card types collected 
        while (distinct < n) {
            int value = getCoupon(n);            // generate a random number 
            count++;                             // iterating count of random numbers generated
            if (!isCollected[value]) {           // if a new random number is generated
                distinct++;
                isCollected[value] = true;
            }
        }
        return count;
    }

    /**
     * @purpose displays the total random numbers for all distinct coupons generated
     * @param void
     * @return void
     */
    public static void getCouponNums()
    {
    	try
    	{
    		int n = Utility.input("enter number: ");
    		if(n > 0)
    		{
    			int count = collect(n);
                System.out.println("Random numbers generated: " + count);	
    		}
    		else
    		{
    			System.out.println("number should be greater than zero.. try again");
    		}
    	}
        catch(NumberFormatException e)													// if user input is other than integer
        {
        	System.out.println("only numbers are allowed.. try again");
        }
    	catch(Exception e)																// handles all other exceptions
    	{
    		System.out.println(e.getMessage());
    	}
    } 
	
}
