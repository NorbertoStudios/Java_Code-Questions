// Exercise 8

import java.util.Scanner;

public class FirstHateForLove {

	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] arg)
	{
		System.out.println("Example:");
		String one = "I hate your guts, and hate you!";
		System.out.println(firstHate(one));
		
		System.out.println("\nType a sentence with the word 'hate' to switch it for love \nOnly the first hate will be switch" );
		System.out.println(firstHate(in.nextLine()));
	}
	
	public static String firstHate(String str)
	{
		System.out.println(str);
		String two = "";
		two = str.replaceFirst("hate", "love");
		System.out.println("I have rephrased your words to read as");
		return two;
	}
}
