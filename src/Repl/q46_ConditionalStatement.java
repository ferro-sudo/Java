package Repl;

import java.util.Scanner;

public class q46_ConditionalStatement {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	int num = inp.nextInt();
	  	
	  	if (num<0) {
	  		System.out.println(num+" is negative");
	  	}if(num>0) {
	  		System.out.println(num+" in positive");
	  	}
inp.close();
	}

}
