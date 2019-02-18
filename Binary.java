package functionalprograms;

// class declaration of swap nibbles in a  byte program
public class Binary
{
	// swap nibbles in a byte
	// takes user input as number
	// and left shift the right side nibbles by 4 digits
	// and right shift the left side nibbles by 4 digits
	public static int swapNibbles(int x)
	{
		return((x & 0x0F) << 4 | (x & 0xF0) >> 4);							// 0x0F is 0000 1111 and 0xF0 is 1111 0000
	}
	
	// displays swapped nibbles in a binary number
	public static void swapBinaryNum()
	{
		try 
		{
			int num = Utility.input("enter number: ");
			if(num > 0)
			{
				int binnum = BinaryConversion.toBinary(num);
				System.out.println("To Binary: " + binnum);
				System.out.println("After swapping nibbles: " + swapNibbles(num));
				System.out.println("To Binary(swapped): " + BinaryConversion.toBinary(swapNibbles(num)));
			}
			else
			{
				System.out.println("number should be greater than zero.. try again");
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("only number input is allowed.. try again");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
