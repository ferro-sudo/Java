package Repl;

import java.util.Scanner;

public class q87_ZombieAtack {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    int inhabitants = scan.nextInt();
	    int remain=inhabitants;
	    
	    for(int i=0;i<inhabitants;i++) {
	    	System.out.println("Day "+i+" ["+remain+"]");
	    	remain/=2;
	    	if (remain==0)
	    		break;
	    }System.out.println("---- EXTINCT ----");

	}

}
