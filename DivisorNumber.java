//Exercise 2

import java.util.Scanner;

public class DivisorNumber
{
	public static Scanner in = new Scanner(System.in);
	public static String input;
	public static void main(String[] arg)
	{
		getDivisor();
		
		while(true)
		{
			System.out.println("Do you want to continued? Y/N");
			input = in.next();
			if(input.equals("N") || input.equals("n"))
			{
				System.err.println("Quitting program");
				System.out.println("Quitting...!");
				break;
			}
			else if(input.equals("Y") || input.equals("y"))
			{
				getDivisor();
			}
			else 
			{
				System.err.println("No a valid input!");
				System.out.println("Please type a valid input");
			}
		}
	}
	
	public static int askNumber()
	{
		System.out.println("Type a Integer to get their divisor!");
		int number = in.nextInt();
		return Math.abs(number);
	}
	
	public static void getDivisor()
	{
		int total = askNumber();
		
		System.out.println("The numbers of divisor are: ");
		for(int i = 1; i <= total; i++)
		{
			if(total % i == 0)
			{
				System.out.print(i+ " ");
			}
		}
		System.out.println("");
	}
}
