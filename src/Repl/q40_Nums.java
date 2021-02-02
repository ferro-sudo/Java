package Repl;

import java.util.Scanner;

public class q40_Nums {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter 2 numbers:");
	    int num1 = input.nextInt();
	    int num2 = input.nextInt();
	    int max = Math.max(num1, num2);  
	    if(num1==num2){
	    	System.out.println(num1+" and "+num2+" are equal");	    
	    }else if (max==num2) {
	    	System.out.println(max+" is greater than "+num1);
	    }else if (max==num1) {
	    	System.out.println(max+" is greater than "+num2);
	    }
	    input.close();
	}

}
