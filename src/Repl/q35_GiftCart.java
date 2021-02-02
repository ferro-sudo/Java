package Repl;

import java.util.Scanner;

public class q35_GiftCart {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String item = scan.nextLine();
	    int itemPrice=0;
	    switch(item.toLowerCase()) {
	    case "charger":
	    	itemPrice=15;
	    	break;
	    case "usb cable" :
	    	itemPrice=10;
	    	break;
	    case "headphones":
	    	itemPrice=30;
	    	break;
	    case "pants":
	    	itemPrice=50;
	    	break;
	    case "hat":
	    	itemPrice=25;
	    	break;
	    case "socks":
	    	itemPrice=5;
	    	break;
	    case "blanket":
	    	itemPrice=60;
	    	break;
	    case "pillow":
	    	itemPrice=40;
	    	break;
	    case "smartphone":
	    	itemPrice=300;
	    	System.out.println("Sorry, not enough funds on your gift card!");
	    	break;
	    case "laptop":
	    	itemPrice=400;
	    	System.out.println("Sorry, not enough funds on your gift card!");
	    	break;
	    default:
	    	itemPrice=101;
	    	System.out.println("Invalid item");
	    }
	    
	    if (itemPrice <= 100) {
	    	System.out.println("Thank you for your purchase!" );
	    	System.out.println("Your current balance is: "+(100-itemPrice)+"$");
	    }
	    scan.close();
	}

}
