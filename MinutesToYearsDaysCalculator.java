
public class MinutesToYearsDaysCalculator {

	public static void main(String[] arg)
	{
		//printYearsAndDays(700000);
		
	}
	
	/// I Added The Months also
	public static void printYearsAndDays(long minutes)
	{
		if(minutes < 0)
		{
			System.out.println("Invalid Value");
		}
		else{
			long years = ((minutes / 60) / 24 ) / 365;
			long month = (((minutes / 60) / 24 ) % 365)/ 30;
			long day = (((minutes / 60) / 24 ) % 365)% 30;
			
			System.out.println(minutes + " min = " +years+ " Year, " + month + " Month and " + day + " Days");
		}

	}
	
	
}
