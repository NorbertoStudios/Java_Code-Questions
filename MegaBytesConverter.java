/*
 * Write a method called printMegaBytesAndKiloBytes that has 1 parameter name kiloBytes
 * 
 * the method should not return  anything (void)
 * 
 * it needs to print a message in the format XX KB = YY MB and ZZ KB
 * xx represent the input on the parameter
 * yy Megabytes
 * zz the remaining kilobytes
 * 
 * if the parameter kiloBytes is < 0 then print the text "Invalid Value"
 * 
 * note 1 MB = 1024 KB
 * 
 */


public class MegaBytesConverter {
	
	public static void main(String[] arg)
	{
	
	  printMegaBytesAndKiloBytes(3409);
	} 
	  public static void printMegaBytesAndKiloBytes(int kiloBytes)
	  {
		  int kb = 1024;
		  int mb = kb;
	      int toMb = kiloBytes/mb;
	      int rem = kiloBytes % mb;
	      
	      if(kiloBytes < 0)
	      {
	          System.out.println("Invalid Value");
	      }
	      else
	        System.out.println(kiloBytes + " KB = " + toMb + " MB and " + rem + " KB");   
	  }
}
