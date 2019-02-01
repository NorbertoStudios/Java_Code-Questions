/*
 *  Write a method bark that has 2 parameters
 *  a boolean name barking and int name it hoursOfDay wich will represent the range from 0 -23
 *  
 *   we have to wake up if the dog is barking before 8:00 or after 22:00 so return true
 *   all other cases return false;
 */


public class BarkingDog {

	public static void main(String[] arg)
	{
		System.out.println(bark(true, 9));
		System.out.println(bark(false, 8));
		System.out.println(bark(true, -1));
		System.out.println(bark(true, 23));
		System.out.println(bark(true, 22));
	}
	
	public static boolean bark(boolean barking, int hourOfDay)
	{

		if(barking == true )
		{
			if(hourOfDay < 0 && hourOfDay > 24)
			{
				return false;
			}else if(hourOfDay >= 0 && hourOfDay <= 23)
			{
				if(hourOfDay == 22 || hourOfDay == 8)
				{
					return false;
				}
				return true;
			}


		}else if(barking == false )
		{
			return false;
		}
		return false;
	}
}
