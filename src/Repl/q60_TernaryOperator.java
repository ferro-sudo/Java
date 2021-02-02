package Repl;

import java.util.Scanner;

public class q60_TernaryOperator {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter number:");
		int x = scan.nextInt();
		
		 x = (x>=5) ? x : -x;
		 System.out.println(x);
	}

}
