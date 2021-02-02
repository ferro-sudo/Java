package assignments.assignment_3;

import java.util.Locale;
import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {

		
		 double liter;
		 double gallon;
		 
		 		Scanner enterGallon = new Scanner(System.in);
				System.out.print("How many Gallons? : ");
				
				gallon = enterGallon.nextDouble();
				
				liter = gallon*(56.7812/15);
				System.out.println(gallon+" Gallons are "+String.format(Locale.US,"%.4f", liter)+" Liters.");
				
				 
			 
		 
	}

}
