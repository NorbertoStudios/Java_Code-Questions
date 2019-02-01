// Exercise 1

public class DoubleChar {

	public static void main(String[] arg)
	{
		System.out.println("There are "+doubleCount("Hobbits love cookies!!h")+" character doubles");
	//	System.out.println(doubleCount("Hobbits!!11.."));
	}
	
	public static int doubleCount(String str)
	{
		int total = 0;
		
		for(int i =0; i < str.length() -1; i++)
		{
			if(str.charAt(i) == str.charAt(i+1))
			{
				total += 1;
			}
		}
		
		return total;
	}
}
