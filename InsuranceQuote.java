/**
 This class computes a home insurance quote.
 @author Haniya Ahmed
*/
import java.util.Scanner;
public class insuranceQuote
{
	/**
	 This is the main method.
	 @param String[] args  
	*/
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int baseRate = 700;  //base insurance rate.
		double quote = baseRate;  //quote of home insurance.


		//checks the house age.	
	
		System.out.println("Enter the year the home was built in: " );
		int houseYear = scan.nextInt();

		if (houseYear < 1950)
		{
		  quote = quote + 80;
		}

	
		//checks the distance from a nearest fire station.

		System.out.println("Enter the distance the home is from the nearest Fire Station: " );
		double distance = scan.nextDouble();
		
		if (distance > 12)
		{
		  quote = quote + 175;
		}


		//checks the number of outdoor lights.

		System.out.println("Enter the number of outdoor lights on your home: ");
		int numLights = scan.nextInt();


		//checks if the house have a security system.

		System.out.println("Does your home have a security system? (yes/no): ");
		String homeSecurity = scan.nextLine();

		while(!(homeSecurity.equals("yes") || homeSecurity.equals("no")))
		{
		  System.out.println("Enter yes or no:");
		  homeSecurity = scan.nextLine();

	       }


		//if the house meet the requirements for discount, then the discount is applied.
		if (homeSecurity.equals("yes") && numLights >= 3)
		{
		   quote = quote - (quote * 0.15);
		}
		
		//output the home insurance rate.
		System.out.println("Insurance rate: " + quote);
	
	} // ends main method
} //ends class definition
			

		
