package Repl;

import java.util.Scanner;

public class q100_GetSandwich {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	     String str = scan.next();
	     int counter=0;	     

	     for(int i=0;i<str.length()-4;i++) {
	    	 if(str.substring(i, i+5 ).contains("bread"))
	    		 counter++;
	     }
	     if (counter>1)
	    	 System.out.println(str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread")));
	     else
	    	 System.out.println("nothing");
	}

}
