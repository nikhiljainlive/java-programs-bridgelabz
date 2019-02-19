package functionalprograms;

// class declaration for finding permutation of string
public class StringPermutation 
{
	// main method to display permutation
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
	
	// method to permute the string
	public static void permute(String str, int l, int r) 
	{ 
		if (l == r) 
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
	
	// method to swap the letters
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
