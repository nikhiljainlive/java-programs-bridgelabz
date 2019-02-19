package functionalprograms;

public class Coupons
{
    // return a random coupon number between 0 and n-1
    public static int getCoupon(int n) 
    {
        return (int) (Math.random() * n);
    }

    // return coupon numbers you collect before obtaining one of each of the n types
    public static int collect(int n) 
    {
        boolean[] isCollected = new boolean[n];  // isCollected[i] = true if card type i already collected
        int count = 0;                           // total random numbers generated
        int distinct  = 0;                       // distinct random numbers generated

        // repeat until you've collected all n card types
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

    // displays the random number
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
        catch(NumberFormatException e)
        {
        	System.out.println("only numbers are allowed.. try again");
        }
    	catch(Exception e)
    	{
    		System.out.println(e.getMessage());
    	}
    } 
	
}
