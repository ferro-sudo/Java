package Repl;

import java.util.Scanner;

public class q84_Book {

	public static void main(String[] args) {
		int freeBooks = 0;
		Scanner scan = new Scanner(System.in);
		boolean isPremiumCustomer = scan.nextBoolean();
		int nbooksPurchased = scan.nextInt();

		if (isPremiumCustomer) {
			if (nbooksPurchased >= 8) {
				freeBooks = (nbooksPurchased / 8) * 2;
				freeBooks += (nbooksPurchased % 8) / 5;
			} else {
				freeBooks += nbooksPurchased / 5;
			}

		} else {
			if (nbooksPurchased >= 12) {
				freeBooks = (nbooksPurchased / 12) * 2;
				freeBooks += (nbooksPurchased % 12) / 7;
			} else {
				freeBooks += nbooksPurchased / 7;
			}
		}
		System.out.println(freeBooks);

	}

}
