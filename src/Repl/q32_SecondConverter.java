package Repl;

import java.util.*;

public class q32_SecondConverter {

	public static void main(String[] args) {
		
		
		int hours, minutes, seconds;
		System.out.println("Enter seconds:");
		int inputSeconds = new Scanner(System.in).nextInt();
		
		
		seconds= inputSeconds%60;
		hours= inputSeconds/60;
		minutes= hours%60;
		hours=hours/60;
		 
		 
		 System.out.println(hours+" hours, "+ minutes+ " minutes, and "+ seconds + " seconds");

	}

}
