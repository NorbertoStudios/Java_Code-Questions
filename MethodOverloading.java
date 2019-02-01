
public class MethodOverloading {

	public static void main(String[] arg)
	{
		System.out.println(calcFeetAndInchesToCentimeters(3,8));

		System.out.println(calcFeetAndInchesToCentimeters(200));


		System.out.println(hasMinuteAndSeconds(65, 45));
		System.out.println(hasMinuteAndSeconds(200));
	}
	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches)
	{
		///  (feet * 12) = inch
		//   (inch * 2.54) = centimeter
		
		// to centimeter = (feet * 12) * 2.54
		
		if (feet < 0 || (inches <0 || inches >12))
		{	
			System.out.println("Invalid Input");
			return -1;
		}
		// calculate centimeters
		double feetTotal = (feet * 12) * 2.54;
		double inchTotal = inches * 2.54;
		
		double cmTotal = feetTotal + inchTotal;
		
		System.out.println( feet + " ft " + inches + " in = " + cmTotal + " cm" );
		
		return cmTotal;
	
	}
	public static double calcFeetAndInchesToCentimeters(double inches)
	{
		if (inches < 0)
		{
			System.out.println("Invalid Input");
			return -1;
		}
		
				// calculate centimeters
		double ft = (int)inches / 12;
		double remindIn = (int) inches % 12;
		return calcFeetAndInchesToCentimeters(ft, remindIn);
		
	}

	
	/////////////////////////
	// Hours, Minutes and Seconds 
	////
	// String format XXh YYm ZZs
	
	public static String hasMinuteAndSeconds(int min, int sec)
	{
		if(min <0 || (sec <0 || sec > 59))
		{
			return "Invalid Input";
			
		}
		int hour = min / 60;
		int minute = min % 60;
		String total = hour + "h " + minute +"m "+ sec +"s ";
		return total;
	}
	public static String hasMinuteAndSeconds(int sec)
	{
		if(sec <0 )
		{
			return "Invalid Input";
		}
		int minute = sec / 60;
		int second = sec % 60;
		return hasMinuteAndSeconds(minute, second);
	}
	
	

	
}
