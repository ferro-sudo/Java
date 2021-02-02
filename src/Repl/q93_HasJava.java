package Repl;

import java.util.Scanner;

public class q93_HasJava {

	public static void main(String[] args) {
		boolean exists = false;
		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		if (word.length() >= 4) {

			for (int i = 0; i < 2; i++) {
				exists = (word.substring(i, i + 5).contains("java")) ? true : false;
				break;
			}
		}
		System.out.println(exists);

	}

}
