package Repl;

import java.util.Scanner;

public class q38_Words {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    String word1 = s.next();
	    String word2 = s.next();
	    
	    if (word1.equals(word2)==true) {
	    	System.out.println("word1 equals word2");
	    }else {
	    	System.out.println("word1 does not equal word2");
	    }
	    
	    s.close();
	}

}
