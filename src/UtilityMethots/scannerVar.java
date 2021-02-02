package UtilityMethots;

import java.util.Scanner;

public class scannerVar {

	public static void main(String[] args) {

		Scanner liked = new Scanner(System.in);
		System.out.println("Which menu you like?");
		int menuNum= liked.nextInt();
		if (menuNum==1) {
			System.out.println("Vegeterian menu.");
			
		}else if (menuNum==2) {
			System.out.println("Beef menu.");
		}else if (menuNum==3) {
			System.out.println("Pasta");
			Scanner souceInt = new Scanner(System.in);
			System.out.println("Souce? Y/N");
			String souce=souceInt.next();
			
			switch (souce.toLowerCase()) {
			case "y":
				System.out.println("good choice!");
			case "n":
				
			
				
				
				
			}
		}

	}

}
