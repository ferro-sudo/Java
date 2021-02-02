package Repl;

import java.util.Scanner;

public class q58_VerifyContains {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.nextLine();
	    String sentence = scan.nextLine();
	    
	    boolean verify = (sentence.contains(word)) ? true : false ;
	    System.out.println(verify);

	}

}
