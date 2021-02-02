package day07_controlFlowStatements;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class task25 {

	public static void main(String[] args) {

		Scanner enterNumbers = new Scanner(System.in);
		System.out.print("Your first number: ");
		int num1 = enterNumbers.nextInt();
		System.out.print("Your second number: ");
		int num2 = enterNumbers.nextInt();
		System.out.print("Your third number: ");
		int num3 = enterNumbers.nextInt();
		
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(num1);
		myNumbers.add(num2);
		myNumbers.add(num3);
		System.out.println("Your numbers are: "+ myNumbers+" The Max is: "+  Collections.max(myNumbers));
		
		


	}

}
