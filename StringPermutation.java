package functionalprograms;

/**
 * @purpose class declaration for finding permutation of string
 * @author Nikhil Jain
 * @version 1.0
 */
public class StringPermutation 
{
	/**
	 * @purpose main method to display permutation
	 * @param args
	 */
	public static void main(String[] args) 
	{ 
		try
		{
			String str = "abc";
			int n = str.length();  
			permute(str, 0, n-1); 
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	} 
	
	/**
	 * @purpose method to permute the string
	 * @param str / string
	 * @param l / left index of string
	 * @param r / right index of string
	 */
	public static void permute(String str, int l, int r) 
	{ 
		if (l == r) 											// base condition to return from recursion
		{
			System.out.println(str);
		}
		else
		{ 
			for (int i = l; i <= r; i++) 
			{ 
				str = swap(str,l,i); 
				permute(str, l+1, r); 
				str = swap(str,l,i); 
			} 
		} 
	} 
	
	/**
	 * @purpose method to swap the letters
	 * @param a / array
	 * @param i / index i
	 * @param j / index j
	 * @return String
	 */
	public static String swap(String a, int i, int j) 
	{ 
		char temp; 
		char[] charArray = a.toCharArray(); 
		temp = charArray[i] ; 
		charArray[i] = charArray[j]; 
		charArray[j] = temp; 
		return String.valueOf(charArray); 
	} 

}
