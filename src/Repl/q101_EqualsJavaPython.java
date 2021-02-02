package Repl;

import java.util.Scanner;

public class q101_EqualsJavaPython {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		int counterJava = 0;
		int counterPython = 0;

		for (int i = 0; i < sentence.length() - 3; i++) {
			if (sentence.substring(i, i + 4).contains("java"))
				counterJava++;
		}
		for (int i = 0; i < sentence.length() - 5; i++) {
			if (sentence.substring(i, i + 6).contains("python"))
				counterPython++;
		}
		System.out.println(counterJava);
		System.out.println(counterPython);
		boolean isEqual = (counterJava == counterPython) ? true : false;
		System.out.println(isEqual);

	}

}
