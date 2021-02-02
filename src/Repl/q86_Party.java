package Repl;

import java.util.Scanner;

public class q86_Party {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String guestList = "";
		String concent = "";
		String guestName = "";

		do {
			System.out.println("Please enter guest name:");
			guestName = input.next();
			System.out.println("Do you want to enter new guest name:");
			concent = input.next();
			if (concent.equalsIgnoreCase("no"))
				guestList += guestName;
			else
				guestList += guestName + ", ";

		} while (concent.equalsIgnoreCase("yes"));

		System.out.println("Guest's list: " + guestList);

	}

}
