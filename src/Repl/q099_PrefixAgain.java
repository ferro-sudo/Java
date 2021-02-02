package Repl;

import java.util.Scanner;

public class q099_PrefixAgain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n = scan.nextInt();
		int counter = 0;

		for (int i = 0; i < str.length() - (n - 1); i++) {
			if (str.substring(i, i + n).contains(str.substring(0, n))) {
				counter++;
			}
		}
		if (counter > 1)
			System.out.println(true);
		else
			System.out.println(false);
	}

}
