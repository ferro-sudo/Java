package Repl;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class q160_UniqueWords {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int size = scan.nextInt();
//		String[] words = new String[size];
//		for (int i = 0; i < size; i++) {
//			words[i] = scan.next();
//		}
		String[] words = { "java", "code", "python", "code", "rust", "code", "rust" };
		printUniqueWords(words);
	}

	public static void printUniqueWords(String[] words) {
		int count = 0;

		for (int i = 0; i < words.length; i++) {

			for (int j = 0; j < words.length; j++) {

				if (words[i].equals(words[j])) {

					count++;
					// System.out.println("c"+count);
				}

			}

			if (count == 1) {

				System.out.println(words[i]);

			}

			count = 0;
		}
	}
}
