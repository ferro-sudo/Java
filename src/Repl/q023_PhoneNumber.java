package Repl;

import java.util.Scanner;

public class q023_PhoneNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Area Code:");
	    int areaCode = scan.nextInt();
	    System.out.println("Local Number:");
	    int localNumber = scan.nextInt();
	    String phoneNumber = "("+areaCode+")-"+localNumber;
	    System.out.println("Calling number "+phoneNumber);
	    scan.close();
	}

}
