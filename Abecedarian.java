// Exercise 4

import java.util.Scanner;
import java.util.Random;

public class Abecedarian 
{
	public static Scanner in = new Scanner(System.in);
	public static String input;
	
	public static String[] abecedarianWords = {"abdest", "acknow", "acorsy", "adempt",
			"adipsy", "agnosy", "befist", "behint", "beknow", "bijoux", 
			"biopsy", "cestuy", "chintz", "deflux", "dehors", "dehort", 
			"deinos", "diluvy", "dimpsy"};
	public static String[] nonAbecedarianWords = {"ability", "account", "action", "agency", "agree", 
			"alone", "beyond", "both"};
	
	public static void main(String[] arg)
	{
		
		generatingWords();
		
		while(true)
		{
			System.out.println("Do you want to continued? Y/N");
			input = in.next();
			if(input.equals("N") || input.equals("n"))
			{
				System.err.println("Program Quitted");
				System.out.println("Quitting...!");
				break;
			}
			else if(input.equals("Y") || input.equals("y"))
			{
				generatingWords();
			}
			else 
			{
				System.err.println("No a valid input!");
				System.out.println("Please type a valid input");
			}
		}
		
	}
	
	public static void generatingWords()
	{
		
		String[] words;
		String abc ;
		Random rand = new Random();
		
		int abcRand1 = rand.nextInt(abecedarianWords.length);
		int abcRand2 = rand.nextInt(nonAbecedarianWords.length);
		
		if(abcRand1 > abcRand2)
		{
			words = abecedarianWords;

			abc = words[abcRand1];
		}else
		{
			words = nonAbecedarianWords;

			abc = words[abcRand2];
		}
		
		System.out.println("The word: " + abc);
		System.out.println("The statement is: " + isAbecedarian(abc));
	}
	
	
	
	public static boolean isAbecedarian(String str)
	{
	
		// not sure 
		int length = str.length();

		char prev;
		char curr;
		
		if (length == 1 )
			{
				return true;
			}
		
		else if(length > 1)
		{
			for (int i = 1; i < length; ++i)
			{
				prev =str.charAt(i-1);
				curr = str.charAt(i);
				if(prev > curr)
				{
					return false;
				}
			}
			return true;
		}
		/*/ 
		*/
		
		
		return false;
	}
}
