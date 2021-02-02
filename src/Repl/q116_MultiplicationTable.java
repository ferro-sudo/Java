package Repl;

import java.util.Scanner;

public class q116_MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a number between 1-12");
	    
	    int num = scan.nextInt();
	    
	    for(int j=1;j<=10;j++){
	      System.out.println(num+" X "+j+" = "+num*j);
	    }
	    scan.close();

	}

}
