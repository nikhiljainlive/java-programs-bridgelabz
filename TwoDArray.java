package functionalprograms;

public class TwoDArray 
{
	public static void twodarray()
	{
		int rows = Utility.input("enter rows: \n");
		int columns = Utility.input("enter columns: \n");
		int[][] a = new int[rows][columns];
		
		readArray(a, rows, columns);
		System.out.println("You entered:");
		displayArray(a, rows, columns);
		
		
		
	}
	
	public static void readArray(int[][] a,int rows,int columns)
	{
		for(int i = 0; i < rows; i++)
		{
			System.out.println("Enter data in row "+ (i+1) + " :");
			for(int j = 0; j < columns; j++)
			{
				a[i][j] = Utility.input("");
			}
		}
	}
	
	public static void displayArray(int[][] a,int rows,int columns)
	{
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < columns; j++)
			{
				System.out.print(a[i][j]+", ");
			}
			System.out.print("\n");
		}
	}
}
