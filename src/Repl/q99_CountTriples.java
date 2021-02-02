package Repl;

import java.util.Scanner;

public class q99_CountTriples {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String str = scan.next();
	    int count = 0 ;
	    //WRITE YOUR CODE HERE
	    
	    for(int i=0;i<str.length()-2;i++) {
	    	if(str.substring(i, i+1).equals(str.substring(i+1, i+2))
	    			&&str.substring(i, i+1).equals(str.substring(i+2, i+3))){
	    		count++;
	    	}
	    }
	    System.out.println(count);

	}

}
