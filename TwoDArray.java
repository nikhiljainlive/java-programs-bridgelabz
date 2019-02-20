package functionalprograms;

/**
 * @purpose class declaration for 2-d array
 * @author Nikhil Jain
 * @version 1.0
 */
public class TwoDArray 
{
	/**
	 * @purpose method for declaring 2-d array
	 * @param void
	 * @return void
	 */
	public static void twodarray()
	{
		try 
		{
			int rows = Utility.input("enter rows: \n");
			int columns = Utility.input("enter columns: \n");
			int[][] a = new int[rows][columns];
			
			readArray(a, rows, columns);
			System.out.println("You entered:");
			displayArray(a, rows, columns);	
		}
		catch(NumberFormatException e)											// if user-input is other than integer
		{
			System.out.println("characters entered in place of integers.. try again!");
			twodarray();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());									// handles other exceptions
		}
	}
	
	/**
	 * @purpose method for reading elements from user
	 * @param a  / array
	 * @param rows / number of rows
	 * @param columns / number of columns
	 */
	public static void readArray(int[][] a,int rows,int columns)
	{
		for(int i = 0; i < rows; i++)
		{
			System.out.println("Enter data in row "+ (i+1) + " :");
			for(int j = 0; j < columns; j++)
			{
				a[i][j] = Utility.input("");
			}//end of inner loop
		}// end of outer loop
	}
	
	/**
	 * @purpose method for displaying elements of array
	 * @param a / array
	 * @param rows / number of rows
	 * @param columns / number of columns
	 */
	public static void displayArray(int[][] a,int rows,int columns)
	{
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < columns; j++)
			{
				System.out.print(a[i][j]+", ");
			}//end of inner loop
			
			System.out.print("\n");
		}// end of outer loop
	}
}
