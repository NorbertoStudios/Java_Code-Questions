
public class PlayingCat {
	public static void main(String[] arg)
	{

		//System.out.println(isCatPlaying(true, 21));
		printNumberInWord(9);
	}


	public static boolean isCatPlaying(boolean summer, int temperature)
	{
		if(!summer)
		{
			if(temperature >= 25 && temperature <= 35 )
			{
				System.out.println("Test");
				return true;
			}
			else if (temperature < 25 || temperature > 35)
			{
				return false;
			}
		}

		else if(summer)
		{
			if(temperature < 25 || temperature > 45)
			{
				return false;
			}
			else if(temperature >= 25 && temperature <= 45 )
			{
				return true;
			}
		}
		return false;
	}



	
	    // NUMBER IN WORDS
	   public static void printNumberInWord(int number)
	    {
	        switch (number)
	        {
	            case 0:
	            {
	                System.out.println("ZERO");
	                break;
	            }
	            case 1:
	            {
	                 System.out.println("ONE");
	             
	                break;
	            }
	            case 2:
	            {
	                 System.out.println("TWO");
	             
	                break;
	            }case 3:
	            {
	                 System.out.println("THREE");
	             
	                break;
	            }case 4:
	            {
	                 System.out.println("FOUR");
	             
	                break;
	            }case 5:
	            {
	                 System.out.println("FIVE");
	             
	                break;
	            }case 6:
	            {
	                 System.out.println("SIX");
	             
	                break;
	            }case 7:
	            {
	                 System.out.println("SEVEN");
	             
	                break;
	            }case 8:
	            {
	                 System.out.println("EIGHT");
	             
	                break;
	            }case 9:
	            {
	                 System.out.println("NINE");
	             
	                break;
	            }default:
	            {
	                 System.out.println("OTHER");
	             
	                break;
	            }
	        }
	    }
	
}
