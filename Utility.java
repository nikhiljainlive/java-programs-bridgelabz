package functionalprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// class declaration for Utility Class
public class Utility 
{
	// declaring object of Scanner class as static
	public   static Scanner scan =new Scanner(System.in);
	
	// declaring object of Random class as static
	public static Random rand = new Random();
	
	// takes the input from user 
	//and checks if it is not other than integer
	public static int input(String s)
	{
		System.out.print(s);
		String strInput = scan.nextLine();
		int intinput = Integer.parseInt(strInput);
		
		return intinput;
	}
	
	// returns true if input string is integer otherwise returns false
	public static boolean isInteger(String s)
	{
		int i = 0, count = 0;
		char ch = s.charAt(i);
		for ( ; i < s.length()-1; i++)
		{
			if(!Character.isDigit(ch))
			{
				count++;
			}
		}
		if(count == 0)
		{
			return true;
		}
		
		return false;
	}
	
	// checks if input value is less than a specified number
	public static boolean isLessthan(int input, int num) 
	{
		if(input < num)
		{
			return true;
		}
		
		return false;
	}
	
	// this method checks if input string contains spaces, digits and special characters
	public static boolean isString(String s)
	{
		
		if(s.length() == 0)										// returns false if the length of string is zero
		{
			return false;
		}
		else if(s.contains(" "))								// checks for white-spaces and spaces in between
		{
				return false;
		}
		else
		{
			int count = 0;
			for(int i = 0; i < s.length(); i++)					// checks for each character in the string
			{													// if there is any character other than letters 
				char ch = s.charAt(i);
				if(!Character.isLetter(ch))
				{
					count++;									// increases the count if the character is not letter
				}
			}
			if(count != 0)
			{
				return false;
			}
		}//end of outer nested if-else block
		
		return true;											// returns true if all above conditions fails
	}
	
	// takes the string input
	public static String stringInput(String s)
	{
		System.out.print(s);
		String string = scan.nextLine();
		
		return string;
	} 
	
	// calculates random number
	public static double randomnum()
	{
		double random = rand.nextDouble();
		
		return random;
	}
	
	// calculates percentage of a specified value
	public static int percent(int num, int total)
	{
		int percent = (num * 100) / total;
		
		return percent;
	}

	// reads array elements
	public static void readArray(int[] a, int capacity)
	{
		try 
		{
			for (int i = 0; i < capacity; i++)
			{
				a[i] = Utility.input("Enter element (" + (i+1) + ") : ");
			}	
		}
		catch(NumberFormatException e)											// handles exception if user input is other than integer
		{
			System.out.println("enter elements in integers... Try again!\n");
			readArray(a, capacity);
		}
		catch(Exception e)														// handles other exception
		{
			System.out.println(e.getMessage());
		}
	}
	
	// creating Stop-watch Timer using time class method
	public static String stopWatchTimer(int startTime)
	{	
		int stopTime = (int) System.currentTimeMillis();							// stopping timer after any key entered
		int ms = (stopTime - startTime);
		int s = ms / 1000;													//int micros = milis /1000;
		int m = s / 60;
		int h = m / 60;
		
		//formats the string
		String displayTimer = String.format("%02d h: %02d m: %02d s: %02d ms", h , ((m>=0 && m<60) ? m : m % 60), ((s>=0 && s<60) ? s : s % 60), ((ms>=0 && ms<100) ? ms : ms % 100));

		return displayTimer;
	}
	
	//checks if the year is of 4 digits or not
		public static int yearCount(int year)
		{
			int count = 0;
			while(year != 0)
			{
				year = year / 10;
				count++;
			}
			return count;														// returns the digits in entered input
		}
	
//----------------------------------------------------------------------------------------------------------------------------------------------
	
	// Algorithm programs
	
//----------------------------------------------------------------------------------------------------------------------------------------------	
	
	//checks if two strings are anagrams
	public static boolean isAnagram(String s1, String s2)
	{
		if (s1.length() != s2.length())
		{
			return false;
		}
		else
		{
			char[] a1 = s1.toCharArray();
			char[] a2 = s2.toCharArray();
			Arrays.sort(a1);
			Arrays.sort(a2);
			String s3 = new String(a1);
			String s4 = new String(a2);
			if (s3.equals(s4))
			{
				return true;
			}
			
			return false;
		}
	}
	
	// checks if a number is palindrome
	public static void isPalindrome(int num)
	{
		int count = 0, tempnum = num;
		
		while(tempnum != 0)
		{
			tempnum = tempnum / 10;
			count++;
		}
		
		int res = 0;
		for(int i = 1; i <= count; i++)
		{
			int rem = num % 10;
			res = res * 10 + rem;
			num = num / 10;
		}
		
		if(res == num)
		{
			System.out.println("Entered number is a palindrome");
		}
		else
		{
			System.out.println("Entered number is not palindrome");
		}
		
	}
	
	// calculates prime numbers within a given range
	public static void getPrimeNumbers(int range1, int range2)
	{
		int i = 0;															//j=0
		int num = 0;
		//Empty String
		String  primeNumbers = "";
		//ArrayList al = new ArrayList();
		for (i = range1; i <= range2; i++)         
		{ 		  	  
			int counter = 0, primes = 0;	  
			for (num = i; num >= 1; num--)
			{
				if (i%num==0)
				{
					counter = counter + 1;
				}
			}// end of inner loop
			if (counter == 2)
			{
				++primes;
			//for(int k = 1; k <= primes+1; k++)
			//{
				//al.add(i, 0);
			//}
				//Appended the Prime number to the Array
				primeNumbers = primeNumbers + i + " ";
			}
																									//j++;
		}// end of outer loop	
		
		System.out.println("Prime numbers from " + range1 + " to " + range2 + " are :");
		System.out.println(primeNumbers);
		//System.out.println(al);
	}
	
	
	
	
	// 4. (i) method for binary search operation on integers
	public static void binarySearchInt(int[] a, int key)
	{
		int li =0, hi = a.length, mi = (li + hi) / 2;
		
		while (li != hi)
		{
			if (a[mi] == key)
			{
				System.out.println("Element found at " + (mi+1) + " position.");
				break;
			}
			else if (key < a[mi])
			{
				hi = mi - 1;
			}
			else
			{
				li = mi + 1;
			}// end of nested if-else
			
			mi = (li + hi) / 2;
		}//end of while loop
		if(li >= hi && a[mi] != key)
		{
			System.out.println("Element not found!");
		}
	}
	
	// 4. (ii) method for binary search operation on strings 
	public static void binarySearchString(String[] s, String key)
	{
		int li = 0, hi = s.length - 1, mi = (li + hi) / 2;
		
		while (li <= hi)
		{
			int value = key.compareTo(s[mi]);
			if (value == 0)
			{
				System.out.println("entered string found at " + (mi+1) + " position in array");
				break;
			}
			else if (value < 0)
			{
				hi = mi - 1;
			}
			else if (value > 0)
			{
				li = mi +1 ;
			}//end of nested if-else condition
			
			mi = (li + hi) / 2;
		}//end of while loop
		if(li >= hi)
		{
			System.out.println("String not found!");
		}
	}
	
	// 4. (iii) insertion sort method for integers
	public static void insertionSortInt(int[] a)
	{
		for(int i = 1; i < a.length; i++)
		{
			int hole = i, value = a[hole];
			while(hole > 0 && a[hole - 1] > value)
			{
				a[hole] = a[hole -1];
				hole = hole - 1;
			}
			a[hole] = value;
		}
		
		System.out.println("Sorting through Insertion Sort Algorithm:\n");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		
		System.out.print("\n");	
	}
	
	// 4. (iv) insertion sort method for strings
	public static void insertionSortString(String[] s)
	{
		for(int i = 0; i < s.length; i++)
		{
			int hole = i;
			String value = s[i];
			while(hole > 0 && s[hole - 1].compareTo(value) > 0)
			{
				s[hole] = s[hole -1];
				hole = hole - 1;
			}
			
			s[hole] = value;
		}
		
		System.out.println("Sorting through Insertion Sort Algorithm:\n");
		for(int i = 0; i < s.length; i++)
		{
			System.out.print(s[i] + " ");
		}
		
		System.out.print("\n");
	}
	
	// 4. (v) bubble sort algorithm implementation on integers
	public static void bubbleSortInt(int[] a)
	{
		int temp;
		for(int i =0; i < a.length-1; i++)
		{
			for(int j = 0; j < a.length-1; j++)
			{
				if(a[j+1] < a[j])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		System.out.println("Sorting through Bubble Sort Algorithm:\n");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		
		System.out.print("\n");	
	}
		
	// 4. (vi) bubble sort algorithm implementation on strings
	public static void bubbleSortString(String[] sArray)
	{
		String temp;
		for(int i =0; i < sArray.length - 1; i++)
		{	
			for(int j = 0; j < sArray.length - 1; j++)
			{
				if (sArray[j].compareTo(sArray[j + 1]) > 0)
				{
					temp = sArray[j];
					sArray[j] = sArray[j + 1];
					sArray[j + 1] = temp;
				}
			}
		}
		
		System.out.println("Sorting through Bubble Sort Algorithm:\n");
		for(int i = 0; i < sArray.length; i++)
		{
			System.out.print(sArray[i] + " ");
		}
		
		System.out.print("\n");
	}
	
	// takes temperature as input and displays the temperature conversion
	public static void temperatureConversion()
	{
		String s = Utility.stringInput("Temperature(with f or c at last) :");
		
		if(s.endsWith("f") || s.endsWith("F") || s.endsWith("c") || s.endsWith("C"))
		{
			String s1 = s.substring(0, s.length()-1);
			
			if(s.endsWith("f") || s.endsWith("F"))
			{
				if(isInteger(s1))
				{
					float f = Float.parseFloat(s1);
					float c = (float) ((f - 32.0) * (5 / 9.0));
					
					System.out.println(c + " °C");
				}
				else
				{
					System.out.println("enter value of f in integers\n");
					temperatureConversion();
				}
				
			}
			else if(s.endsWith("c") || s.endsWith("C"))
			{
				if(isInteger(s1))
				{
					float c = Float.parseFloat(s1);
					float f = (float) (c * (9 / 5.0)) + 32;
					
					System.out.println(f + " °F");
				}
				else
				{
					System.out.println("enter value of f in integers\n");
					temperatureConversion();
				}
			}	
		}
		else
		{
			System.out.println("Wrong input! Try again");
			temperatureConversion();
		}
	}
}
