package functionalprograms;

// class declaration for coupon numbers program
public class CouponNumbers 
{
	// finds coupon numbers
	public static void getCouponNums()
	{
		int n = Utility.input("enter number of coupon numbers to generate: ");
		int[] randomCoupons = new int[n];
		int rcount = 0;
		
		//while()
		//{
		int i = 0;
			while(i != n-1)
			{
				int rn = (int) Utility.rand.nextInt(9) + 1;
				rcount++;
				
				while(rn != randomCoupons[i])
				{
					rcount++;
					randomCoupons[i] = rn;
					i++;
					rcount++;
					break;
				}
			
			}
		//}
		
		for(i = 0; i < n; i++)
		{
			System.out.println(randomCoupons[i]);
			System.out.println("Random Numbers generated: " + rcount);
		}
		
	}
}
