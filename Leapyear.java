import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int year=1700;
	     // System.out.println("enterv the year");
	     // Scanner r = new Scanner(System.in);
	    //  year=r.nextInt();
//
	        if(year%100==0 && year%400==0 || year%100!= 0 && year %4==0)
	        {
	        	
	        System.out.print(year + " is a leap year.");
	        } 
	        else 
	        {
			    	System.out.print(year + " is  not a leap year.");
}
}
}



