package Repl;

import java.util.Scanner;

public class q59_FindAUser {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Enter full name:");
		String name=scan.nextLine();
		
		String userName= (name.equalsIgnoreCase("Max Payne")||name.equalsIgnoreCase("Alan Wake")) ? "User found!" : "User not found!";
		System.out.println(userName);
	}

}
