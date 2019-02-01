// Exercise 5

import java.util.Random;
import java.util.Scanner;

public class Doubloon {

	public static Scanner in = new Scanner(System.in);
	public static String input;
	
	public static String[] doubloonWords = {"Abba", "Anna", "appall", "appearer", "appeases", "arraigning", "beriberi", "bilabial", 
			"boob",	"Caucasus", "coco", "Dada", "deed", "Emmett", "Hannah", "horseshoer", "intestines", "Isis", 
			"mama", "Mimi", "murmur", "noon", "Otto", "papa", "peep", "reappear", "redder", "sees", 
			"Shanghaiings", "Toto" };
	public static String[] nonDoubloonWords = {"abdest", "acknow", "acorsy", "adempt",
			"adipsy", "agnosy", "befist", "behint", "beknow", "bijoux", 
			"biopsy", "cestuy", "chintz", "deflux", "dehors", "dehort", 
			"deinos", "diluvy", "dimpsy"};
	
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
	
	public static boolean isDoubloon(String str)
	{
		str.toLowerCase();
		
		// not sure 
		int length = str.length();

		int count = 0;
		
		if(length > 1)
		{
			for (int i = 0; i < length -1; i++)
			{
				for(int j = i+1 ; j < length; j++)
				{
					if(str.charAt(i) == str.charAt(j))
					{
						count++;
					}
				}
			}
			
			if(count > 0)
			{
				return true;
			}
			
		}
		else if (length == 1 )
		{
			return false;
		}

		return false;
	}


	public static void generatingWords()
	{
		
		String[] words;
		String abc ;
		Random rand = new Random();
		
		int abcRand1 = rand.nextInt(doubloonWords.length);
		int abcRand2 = rand.nextInt(nonDoubloonWords.length);
		
		if(abcRand1 > abcRand2)
		{
			words = doubloonWords;

			abc = words[abcRand1];
		}else
		{
			words = nonDoubloonWords;

			abc = words[abcRand2];
		}
		
		System.out.println("The word: " + abc);
		System.out.println(isD(isDoubloon(abc))+ " = " + isDoubloon(abc));
	}
	
	public static String isD(boolean a)
	{
		String s;
		if(a)
		{
			s = "Is a doubloon word!";
		}
		else
		{
			s = "its NOT a doubloon word!";
		}
		return s;
	}
}
