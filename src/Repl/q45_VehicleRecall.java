package Repl;

import java.util.Scanner;

public class q45_VehicleRecall {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Enter vehicle's year:");
		int vehicleYear = new Scanner(System.in).nextInt();		
		
		if ((vehicleYear>=1995 && vehicleYear<=1998)
				||(vehicleYear>=2001 && vehicleYear<=2002)
				||(vehicleYear>=2004 && vehicleYear<=2006)
				||(vehicleYear>=2015 && vehicleYear<=2017)) {
			System.out.println("Your vehicle needs to be recalled!");			
		}else {
			System.out.println("Your vehicle is fine, enjoy!");
		}
		
		
	}

}
