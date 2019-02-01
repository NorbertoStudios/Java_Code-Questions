/*/
 * teen age is from (13 - 19)
 * 
 * Write a method hasTeen with 3 parameters type int
 * 
 * the method should return true if one of the parameters are between 13-19
 * 
*/
public class TeenNumberChecker {

	public static void main(String[] arg)
	{
		System.out.println(hasTeen(12,2,34));
		System.out.println(hasTeen(10,2,34));
	}
	
	public static boolean hasTeen(int x, int y, int z)
	 {
	    return ((x >= 13 && x<= 19) || (y >= 13 && y<= 19) || (z >= 13 && z<= 19));
	     
	 }
}
