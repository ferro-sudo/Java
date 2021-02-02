package Repl;

import java.util.Scanner;

public class q97_CountJava {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int counter = 0;

		for (int i = 0; i < word.length()-3; i++) {
			if (word.substring(i, i + 4).contains("java")) {
				counter++;
			}
		}
		System.out.println(counter);

	}

}
