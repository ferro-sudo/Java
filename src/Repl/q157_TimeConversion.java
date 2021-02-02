package Repl;

import java.util.Scanner;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class q157_TimeConversion {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		timeConversion(scan.nextLine());
		scan.close();
	}
		  
	public static void timeConversion(String s) {

		 String s1[]=s.split(":");
		    char c[]=s1[2].toCharArray();
		    if(s1[2].contains("PM"))
		    {
		        int n=Integer.parseInt(s1[0]);
		        n=n+12;
		      System.out.println(n+":"+s1[1]+":"+c[0]+c[1]);
		    }
		    else {
		    	System.out.println(s1[0]+":"+s1[1]+":"+c[0]+c[1]);
		    }
        
				 
				 
	}
	

}
