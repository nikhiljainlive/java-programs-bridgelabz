package functionalprograms;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//class declaration for Word Search from file method
public class WordSearchFromFile
{
	// stores words of file in a string array
	// uses Bubble sort Utility method to sort the words
	// uses Binary Search Utility method for searching the specified element
	public static void searchWord() throws FileNotFoundException
	{
		String text = "/home/admin1/eclipse-workspace/nikhiljain/nikhil.txt";
		BufferedReader file = new BufferedReader(new FileReader (text));
		String line = "";
		String[] strings = null;
		
		try 
		{
			while((line = file.readLine()) != null)
			{
				strings = line.split(" ");
			}
			
			System.out.println("Data received from file:\n");
			for(String s : strings)
			{
				System.out.print(s + " ");
			}
			System.out.println();
			
			Utility.bubbleSortString(strings);
			String key = Utility.stringInput("enter word to search: ");
			Utility.binarySearchString(strings, key);
			file.close();
		} 
		catch (IOException e) 
		{											// handles IO exceptions
			e.printStackTrace();
		}
	}
}
