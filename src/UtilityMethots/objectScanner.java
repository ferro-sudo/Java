package UtilityMethots;

import java.util.Scanner;

public class objectScanner {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter 3 numbers:");
	    String  item1, item2, item3 = scan.nextLine();
	    double price1, price2, price3 = scan.nextDouble();
	    int num1 = 0, num5 = scan.nextInt();
	    int num2 = scan.nextInt();
	    int num3 = scan.nextInt();
	    int sum= num1+num2+num3;
	    System.out.println("Sum of numbers: "+sum);
		
		
		
		

	}

}
