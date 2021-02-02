package Repl;

import java.util.Scanner;

public class q153_SplitPerson {

	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
		    String s = inp.next();
		    person(s) ;
	}
		  
	public static void person(String info) {
		String[] name= info.split(",");
		System.out.println("person name: "+name[0]+" last name: "+name[1]+" age: "+name[2]);
		
			


				
			
	}

}
