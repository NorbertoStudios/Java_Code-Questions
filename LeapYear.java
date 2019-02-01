/*
 * Write a method isLeapYear with a parameter of type int named year
 * year should range from 1 to 9999
 * return false if not in range
 * 
 * Note:
 *  A year leap if it is divisible by 4 but not by 100, or it is divisible by 400
 * 
 */


public class LeapYear {

	public static void main(String[] arg)
	{
		System.out.println(isLeapYear(-1600));
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(2017));
		System.out.println(isLeapYear(2000));
		System.out.println(isLeapYear(2018));
		System.out.println(isLeapYear(1800));
		System.out.println(isLeapYear(1924));
	}
	
	public static boolean isLeapYear(int year)
	{
		int div = year % 100;
		int total = year % 4;
		int total1 = year % 400;
		
		if(year < 0 && year > 9999)
		{
			return false;
		}
		else if(year > 1 && year <= 9999)
		{
			if (total == 0 && div != 0 || total1 == 0)
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
		
		return false;
		
	}
}
