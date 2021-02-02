package Repl;

import java.util.Scanner;

public class q026_posNeg {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int num = s.nextInt();
	    if (num>0) {
	    	System.out.println("positive");
	    }if (num<0) {
	    	System.out.println("negative");
	    }if (num==0) {
	    	System.out.println("zero");
	    }
s.close();
	}

}
