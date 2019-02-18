package functionalprograms;

// class declaration for coupon numbers program
public class CouponNumbers 
{
	// finds coupon numbers
	public static void getCouponNums()
	{
		int n = Utility.input("enter N:  ");
		int[] ranCoupons = new int[n];
		int rcount = 0, i = 0;
		int length = ranCoupons.length;
		while(length != 0)
		{
			int rn = (int) Utility.rand.nextInt(9) + 1;
			//for(int j = 0; j <= ; j++)
		//	{
				if(ranCoupons[i] == rn)																	
				{
					break;
				}																			
				else																			
				{
					ranCoupons[i] = rn;
					break;
					//length--;
				}
				//rcount++;
			//}
		}
		
		for(i = 0; i < n; i++)
		{
			System.out.println(ranCoupons[i]);
			System.out.println("Random Numbers generated: " + rcount);
		}
		
	}
}
