/*
 * write a method hasEqualSum with 3 parameter of type int
 * 
 * the method should return true if the third parameter equals the sum of the first two. 
 * Otherwise return false
 */


public class EqualSumChecker {

	public static void main(String[] arg)
	{
		System.out.println(hasEqualSum(1,1,1));
		System.out.println(hasEqualSum(1,1,2));
	}
	 public static boolean hasEqualSum(int x, int y, int z)
	 {
	     return (x+y == z);
	 }
}
