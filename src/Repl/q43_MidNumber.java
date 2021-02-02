package Repl;

import java.util.Scanner;

public class q43_MidNumber {

	public static void main(String[] args) {
		
		int num1, num2, num3, med=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:"); 
		num1 = scan.nextInt();
		System.out.println("Enter second number:"); 
		num2 = scan.nextInt();
		System.out.println("Enter third number:"); 
		num3 = scan.nextInt();
		if (num1>num2 && num1<num3) {
			med=num1;
		}else if (num2>num1 && num2<num3) {
			med=num2;
		}else if (num3>num1 && num3<num2) {
			med=num3;
		}
		System.out.println("Medium value is: "+med);
		
		scan.close();
	}

}
