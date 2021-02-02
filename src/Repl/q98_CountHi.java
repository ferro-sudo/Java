package Repl;

import java.util.Scanner;

class q98_CountHi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
	    int counter=0;
	    
	    for(int i=0;i<str.length()-1;i++) {
	    	if(str.substring(i, i+2).contains("hi"))
	    		counter++;
	    }
	    System.out.println(counter);

	}

}
