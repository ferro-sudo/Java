package Repl;

import java.util.Scanner;

public class q44_Blackjack {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    
	    
	    int house = s.nextInt();
	    int player = s.nextInt();
	    
	    if (player>=21) {
	    	System.out.println("bust");
	    }else if(house>player) {
	    	System.out.println("player loss");
	    }else if(house==player) {
	    	System.out.println("its a tie");
	    }else if(house<player) {
	    	System.out.println("player wins");
	    }
	    s.close();
	}

}
