package Repl;

import java.util.Scanner;

public class q48_ConPractice {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	String name = inp.nextLine();
	  	
	  	if (name.toLowerCase().equals("chen")) {
	  		System.out.println("teacher");
	  	}else {
	  		System.out.println("student");
	  	}
	  	inp.close();
	}

}
