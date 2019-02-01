/*
 * Write a method areEqualByThreeDecimalPlaces with two parameters of type double
 * 
 * the method should return true if the two numbers are the same up to 3 decimal places 
 * Otherwise return false
 */


public class DecimalComparator {

	public static void main(String[] arg)
	{
		System.out.println(areEqualByThreeDecimalPlaces(1.234, 1.2345));
		System.out.println(areEqualByThreeDecimalPlaces(1.534, 1.2345));
	}
	
	 public static boolean areEqualByThreeDecimalPlaces (double x, double y)
	 {
		 int firstN = (int)(x * 1000);
	     int secondN = (int)(y * 1000);
	     return (firstN == secondN);
	 }
}
