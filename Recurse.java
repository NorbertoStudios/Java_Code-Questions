// Exercise 3

public class Recurse {
	
	public static void main(String[] arg)
	{
		printString("helloow");
		printBackward("hellow");
		System.out.println(reverString("coffee"));
		System.out.println(isPalidrome("otito"));
		System.out.println(isPalidrome("otitu"));
		System.out.println(isPalidrome("o"));
		System.out.println(isPalidrome("ot"));
		System.out.println(isPalidrome("oo"));
	}
	
	/** * Returns the first character of the given String. */
	public static char first(String s) {
	return s.charAt(0);
	}
	/** * Returns all but the first letter of the given String. */
	public static String rest(String s) {
	return s.substring(1);
	}
	/** * Returns all but the first and last letter of the String. */
	public static String middle(String s) {
	return s.substring(1, s.length() - 1);
	}
	/** * Returns the length of the given String. */
	public static int length(String s) {
	return s.length();
	}
	
	public static void printString(String str)
	{
		//System.out.println(first(str));
		//System.out.println(middle(str));
		//System.out.println(rest(str));
		
		for(int i =0; i < length(str); i++)
		{
			System.out.println(str.substring(i, i+1));
			
		}
	}
	
	public static void printBackward(String str)
	{
		for(int i = length(str) -1; i >= 0; i--)
		{
			System.out.println(str.substring(i, i+1));
		}
	}
	
	public static String reverString(String str)
	{
		String backwards = "";
		
		
		for(int i = length(str) -1; i >=0; i--)
		{
			backwards = backwards + str.charAt(i);
		}
		//System.out.println(backwards);
		return backwards;
	}
	
	public static boolean isPalidrome(String str)
	{
		
		System.out.println("The word "+"'"+ str+"'");
		
		if(str.length() == 1)
		{
			System.out.println("Is a palindrome");
			return true;
		}
		else if(str.length() == 2)
		{
			if(first(str) == str.charAt(str.length()-1))
			{
				System.out.println("Is a palindrome");
				return true;
			}
			else
			{
				System.out.println("'"+first(str)+"'"+" does not equals "+"'"+str.charAt(str.length()-1)+"'");
				System.out.println("Is Not A Palindrome!");
				return false;
			}
		}
		else if(str.length() >= 2)
		{
			String rev = reverString(middle(str));
			if(first(str) == str.charAt(str.length()-1))
			{
				if(rev.equals(middle(str))) 
				{
					System.out.println("Is a palindrome");
					return true;
				}
			}
			else
			{
				System.out.println("'"+first(str)+"'"+" does not equals "+"'"+str.charAt(str.length()-1)+"'");
				System.out.println("Is Not A Palindrome!");
				return false;
			}
		}
		return false;
	}
	
}
