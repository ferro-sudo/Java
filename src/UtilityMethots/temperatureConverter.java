package UtilityMethots;

import java.util.Scanner;

public class temperatureConverter {
	
	public static void ScanObject() {
		double result;
		Scanner tempr = new Scanner(System.in);
		System.out.println("What is the teperature?");

		double degrees = tempr.nextDouble();
		Scanner celOrFah = new Scanner(System.in);
		System.out.println("For Fahrenheit put (f/F), For Celsius pu (c/C)");
		String concent = celOrFah.next();
		
		switch (concent.toLowerCase()) {
		case "f":
			result= (5.0/9)*(degrees-32);
			System.out.println(degrees +" Fahrenheit= "+ String.format("%.2f", result)+" Celsius degrees.");
			AskAgain();
			break;
		case "c":
			result= (degrees * 9.0/5) + 32;
			System.out.println(degrees +" Celsius degrees, "+ String.format("%.2f", result)+" Fahrenheit degrees.");
			AskAgain();
			break;
		default :
			System.out.println("invalid input");
			ScanObject();
		}
	}
		
	public static void AskAgain(){	
		Scanner askAgain = new Scanner(System.in);
		System.out.println("Press any key to continue, Space for Escape.");
		String yesOrNo="";
		yesOrNo = askAgain.next();
		if (yesOrNo != null) {
			ScanObject();
		}else if  (yesOrNo == null){
			System.out.println("Good Bye");
		}
	}
		
		
	

	public static void main(String[] args) {
		try {
		double result;
		Scanner tempr = new Scanner(System.in);
		System.out.println("What is the teperature?");

		double degrees = tempr.nextDouble();
		Scanner celOrFah = new Scanner(System.in);
		System.out.println("For Fahrenheit put (f/F), For Celsius pu (c/C)");
		String concent = celOrFah.next();
		
		switch (concent.toLowerCase()) {
		case "f":
			result= (5.0/9)*(degrees-32);
			System.out.println(degrees +" Fahrenheit= "+ String.format("%.2f", result)+" Celsius degrees.");
			AskAgain();
			break;
		case "c":
			result= (degrees * 9.0/5) + 32;
			System.out.println(degrees +" Celsius degrees, "+ String.format("%.2f", result)+" Fahrenheit degrees.");
			AskAgain();
			break;
		default :
			System.out.println("invalid input");
			ScanObject();
		}
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		}
			
			
	}
		

}


