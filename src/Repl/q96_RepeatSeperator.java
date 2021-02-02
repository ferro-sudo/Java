package Repl;

import java.util.Scanner;

public class q96_RepeatSeperator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String separator = scan.next();
		int count = scan.nextInt();
		String str = "";

		for (int i = 0; i < count; i++) {
			if (count - 1 == i)
				str += word;
			else
				str += word + separator;
		}
		System.out.println(str);

	}

}
