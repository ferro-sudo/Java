package Repl;

import java.util.Scanner;

public class q34_VendingMachine {

	public static void main(String[] args) {
		
		System.out.println("Enter price in cents:");
		int itemPrice = new Scanner(System.in).nextInt();

		int change= 100-itemPrice;
		int quarters, dimes, nickels;		
		
	    quarters = change/25;
	    change = change%25;
	    dimes = change/10;
	    change = change%10;
	    nickels = change/5;
	    //change = change%5;
	    if (itemPrice<25 || itemPrice>100) {
	    	System.out.println("Invalid price!");
	    }else if(itemPrice%5 != 0) {
	    	System.out.println("Invalid price!");
	    }else {		
		System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, and "+nickels+" nickels.");
	    }
	}

}
