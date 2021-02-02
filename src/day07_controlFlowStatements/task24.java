package day07_controlFlowStatements;

import java.util.Scanner;

public class task24 {

	public static void main(String[] args) {
		
		try (Scanner enterAge = new Scanner(System.in)) {
			System.out.print("Your Age:");
			
			int yourAge = enterAge.nextInt();
			
			
			if (yourAge>=18) {
				System.out.println("You are eligible to vote.");
			}
			else {
				System.out.println("Sorry! You can not vote!!!");
			}
		}
		
		

	}

}
