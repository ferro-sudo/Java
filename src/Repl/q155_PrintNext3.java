package Repl;

import java.util.Scanner;

public class q155_PrintNext3 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
	    System.out.print("enter number");
	    int num = inp.nextInt();
	    
	    next3(num);

	}

	public static void next3(int i) {
		// TODO Auto-generated method stub
		System.out.println((i+1)+" "+(i+2)+" "+(i+3));
	}

}
