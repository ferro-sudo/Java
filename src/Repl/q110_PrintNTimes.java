package Repl;

import java.util.Scanner;

public class q110_PrintNTimes {

	public static void main(String[] args) {
		
		int j = 0;
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    //WRITE YOUR CODE HERE
	    for(j=0;j<n;j++){
	      System.out.print("*");
	    }
	    scan.close();

	}

}
